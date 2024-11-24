
package com.example.demo.controller;

import com.alibaba.cloud.ai.dashscope.chat.DashScopeChatOptions;
import com.alibaba.fastjson2.JSON;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@RestController
@RequestMapping("ai")
public class TestController {

    private final ChatClient chatClient;

        public TestController(ChatClient.Builder builder) {
          SimpleLoggerAdvisor simpleLoggerAdvisor = new SimpleLoggerAdvisor(
                request -> "Prompt: " + request.userText(),
                response -> "Result: " + response.getResult());
          builder.defaultAdvisors(simpleLoggerAdvisor)
                  .defaultSystem("你是一个著名的导演，用国内著名导演{user}的声音描述一些电影相关的问题。");

        this.chatClient = builder.build();
    }


    //使用自动配置的ChatClient
    @GetMapping("/hello")
    public String generation(@RequestParam String userInput) {
        String content = this.chatClient
                //提示词
                .prompt()
                //用户输入的内容
                .user(userInput)
                //向模型发起请求
                .call()
                .content();
        System.err.println("content:" + content);
        return content;
    }

    @GetMapping("/resp")
    public ChatResponse resp(@RequestParam String userInput) {
        ChatResponse chatResponse = chatClient.prompt()
                .user(userInput)
                .call()
                .chatResponse();
        System.err.println(JSON.toJSONString(chatResponse));
        return chatResponse;
    }


    //动态指定模型
    @GetMapping("/resp2")
    public ChatResponse resp2(@RequestParam String userInput) {
        new Prompt(userInput,
                DashScopeChatOptions.builder()
                        .withModel("qwen-plus")
                        .withTemperature(1.4)
                        .build());
        ChatResponse chatResponse = chatClient.prompt()
                .user(userInput)
                .call()
                .chatResponse();
        System.err.println(JSON.toJSONString(chatResponse));
        //0.4 qwen plus 当前时间为2023年10月6日14时37分。（请注意，由于网络传输和设备时间差异，实际时间可能会有几秒至几分钟的误差）
        //0.4  max      当前时间为2023年10月6日14时57分。请注意，这是根据我接收信息的时间给出的答案，与您实际收听到的时间可能略有不同。
        //1.4 qwen plus 当前时间为2023年11月，但具体的小时和分钟我无法提供，因为我没有接入实时的时间数据。您可以在设备上查看具体的时间。
        //1.4  max      当前时间为2023年11月，但具体的时间（如小时和分钟）我无法提供，因为我是没有实时数据能力的人工智能模型。您可以通过查看设备上的时钟来获取准确的当前时间。
        return chatResponse;
    }

    @GetMapping("/entity")
    public ActorFilms entity(@RequestParam String userInput) {
        ActorFilms actorFilms = chatClient.prompt()
                .user(userInput)
                .call()
                .entity(ActorFilms.class);
        System.err.println(JSON.toJSONString(actorFilms));
        return actorFilms;
    }

    record ActorFilms(String actor, List<String> movies) {

    }

    @GetMapping("/stream")
    public String stream(@RequestParam String userInput) {
        Flux<String> flux = chatClient.prompt()
                .user(userInput)
                .stream().content();
        String collect = flux.collectList().block().stream().collect(Collectors.joining());
        System.err.println(collect);
        return collect;
    }



      @GetMapping("/fillText")
    public Map<String, String> stream(@RequestParam String userInput,@RequestParam String user) {
       return Map.of("输出结果",
				this.chatClient.prompt()
						.system(sp -> sp.param("user", user))
						.user(userInput)
						.call()
						.content());
    }
1
}
