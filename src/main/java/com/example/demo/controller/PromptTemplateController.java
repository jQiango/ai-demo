package com.example.demo.controller;

import com.alibaba.cloud.ai.prompt.ConfigurablePromptTemplateFactory;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("ai")
public class PromptTemplateController {

    private final ChatClient chatClient;

    private final ConfigurablePromptTemplateFactory configurablePromptTemplateFactory;


    @Value("classpath:/prompts/joke-prompt.st")
    private Resource presetPrompt;

    public PromptTemplateController(ChatClient.Builder builder, ConfigurablePromptTemplateFactory configurablePromptTemplateFactory) {
        this.configurablePromptTemplateFactory = configurablePromptTemplateFactory;
        SimpleLoggerAdvisor simpleLoggerAdvisor = new SimpleLoggerAdvisor();
        builder.defaultAdvisors(simpleLoggerAdvisor)
                .defaultSystem("你是一个著名的导演，用国内著名导演{user}的声音描述一些电影相关的问题。");
        this.chatClient = builder.build();
    }


    @GetMapping("local/prompt")
    public AssistantMessage completion(@RequestParam(value = "adjective", defaultValue = "funny") String adjective,
                                       @RequestParam(value = "topic", defaultValue = "cows") String topic) {
        PromptTemplate promptTemplate = new PromptTemplate(presetPrompt);
        Prompt prompt = promptTemplate.create(Map.of("adjective", adjective, "topic", topic));
        return chatClient.prompt(prompt).call().chatResponse().getResult().getOutput();
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
