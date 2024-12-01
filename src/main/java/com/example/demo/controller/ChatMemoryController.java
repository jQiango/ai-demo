package com.example.demo.controller;

import com.alibaba.cloud.ai.prompt.ConfigurablePromptTemplateFactory;
import com.example.demo.config.SimpleLoggerAdvisor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("ai")
public class ChatMemoryController {

    private final ChatClient chatClient;

    @Value("classpath:/prompts/test-prompt.st")
    private Resource presetPrompt;

    public ChatMemoryController(ChatClient.Builder builder,
                                ConfigurablePromptTemplateFactory configurablePromptTemplateFactory,
                                ChatMemory chatMemory) {

        SimpleLoggerAdvisor simpleLoggerAdvisor = new SimpleLoggerAdvisor();
        builder.defaultAdvisors(simpleLoggerAdvisor)
                .defaultAdvisors(new MessageChatMemoryAdvisor(chatMemory));
        this.chatClient = builder.build();
    }

    @RequestMapping("/memory")
    public String memory(@RequestParam(value = "context") String context,
                         @RequestParam(value = "question") String question) {
        PromptTemplate promptTemplate = new PromptTemplate(presetPrompt);
        Prompt prompt = promptTemplate.create(Map.of("context", context, "question", question));
        return chatClient.prompt(prompt).call().content();
    }
}
