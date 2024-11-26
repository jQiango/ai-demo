package com.example.demo.config;

import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class ChatClientConfig {
//    @Bean("embedTextChatClient")
//    public ChatClient embedTextChatClient(ChatClient.Builder builder) {
//        builder.defaultAdvisors(buildSimpleLog());
//        return builder.defaultSystem("你是一个著名的导演，用国内著名导演{user}的声音描述一些电影相关的问题。")
//                .build();
//    }
//
//
//
//   private SimpleLoggerAdvisor buildSimpleLog(){
//       return new SimpleLoggerAdvisor(
//               request -> "Prompt: " + request.userText(),
//               response -> "Result: " + response.getResult());
//    }
}
