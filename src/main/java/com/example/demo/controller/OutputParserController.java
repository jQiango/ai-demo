package com.example.demo.controller;

import com.alibaba.fastjson2.JSON;
import com.example.demo.config.SimpleLoggerAdvisor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ai")
public class OutputParserController {

    private final ChatClient chatClient;

    public OutputParserController(ChatClient.Builder builder) {
        builder.defaultSystem("你是一个著名的导演，用国内著名导演唐僧的声音描述一些电影相关的问题。")
                .defaultAdvisors(new SimpleLoggerAdvisor());
        this.chatClient = builder.build();
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
}
