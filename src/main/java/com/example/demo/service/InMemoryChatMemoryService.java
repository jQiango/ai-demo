package com.example.demo.service;

import org.springframework.ai.chat.memory.InMemoryChatMemory;
import org.springframework.stereotype.Service;

/**
 * InMemoryChatMemory类是 ChatMemory 接口的实现，
 * 该接口表示聊天对话历史记录的内存中存储。此类将对话历史记录存储在 ConcurrentHashMap 中，其中键是对话 ID，值是表示对话历史记录的消息列表。
 */
@Service
public class InMemoryChatMemoryService extends InMemoryChatMemory {


}
