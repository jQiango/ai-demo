package com.example.demo.controller;

import com.alibaba.cloud.ai.dashscope.audio.transcription.AudioTranscriptionModel;
import com.alibaba.cloud.ai.dashscope.image.DashScopeImageOptions;
import org.springframework.ai.image.ImageModel;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ai")
public class ChatModelController {

    private final AudioTranscriptionModel audioTranscriptionModel;
    private final ImageModel imageModel;

    public ChatModelController(AudioTranscriptionModel audioTranscriptionModel, ImageModel imageModel) {
        this.audioTranscriptionModel = audioTranscriptionModel;
        this.imageModel = imageModel;
    }

    @RequestMapping("/imageModel")
    public ImageResponse chatModel(@RequestParam String input) {
        ImageResponse imageResponse = imageModel.call(new ImagePrompt("浅奶油色迷你金色涂鸦"),
                DashScopeImageOptions.builder()
                        .withModel("qwen-vl-max-latest").build());
        return imageResponse;
    }

//    @RequestMapping("/audioTranscriptionModel")
//    public String imageModel(String input) {
//        ChatResponse response = audioTranscriptionModel.call(new AudioTranscriptionPrompt(""));
//        return response.getResult().getOutput().getContent();
//    }
}
