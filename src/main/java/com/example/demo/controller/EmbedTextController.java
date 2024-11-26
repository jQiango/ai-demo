package com.example.demo.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("ai")
public class EmbedTextController {

    private final ChatClient chatClient;

    public EmbedTextController(ChatClient.Builder builder) {
        SimpleLoggerAdvisor simpleLoggerAdvisor = new SimpleLoggerAdvisor(
                request -> "Prompt: " + request.userText(),
                response -> "Result: " + response.getResult());
        builder.defaultAdvisors(simpleLoggerAdvisor)
                .defaultSystem("你是一个著名的导演，用国内著名导演{user}的声音描述一些电影相关的问题。");
        this.chatClient = builder.build();
    }


    @GetMapping("/embed")
    public Map<String, String> stream(@RequestParam String userInput, @RequestParam String user) {
        return Map.of("输出结果",
                this.chatClient.prompt()
                        .system(sp -> sp.param("user", user))
                        .user(userInput)
                        .call()
                        .content());
    }
}
