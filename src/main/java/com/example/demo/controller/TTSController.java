package com.example.demo.controller;

import com.alibaba.cloud.ai.dashscope.audio.synthesis.SpeechSynthesisModel;
import com.alibaba.cloud.ai.dashscope.audio.synthesis.SpeechSynthesisPrompt;
import com.alibaba.cloud.ai.dashscope.audio.synthesis.SpeechSynthesisResponse;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/**
 * TODO
 *
 * @author jqiang
 * 2024/12/02 11:40
 */
@RestController
@RequestMapping("/ai")
public class TTSController {

    @Resource
    private SpeechSynthesisModel speechSynthesisModel;

    private static final String FILE_PATH = "/Users/jqiang/Downloads/";


    @GetMapping("/tts")
    public void tts(@RequestParam String input) throws IOException {
        SpeechSynthesisResponse response = speechSynthesisModel.call(new SpeechSynthesisPrompt(input));
        File file = new File(FILE_PATH + System.currentTimeMillis() + ".mp3");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            ByteBuffer byteBuffer = response.getResult().getOutput().getAudio();
            fos.write(byteBuffer.array());
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }


    @GetMapping("/tts/stream")
    public void streamTTS(@RequestParam String input) {
        Flux<SpeechSynthesisResponse> response = speechSynthesisModel.stream(new SpeechSynthesisPrompt(input));

        CountDownLatch latch = new CountDownLatch(1);
        File file = new File(FILE_PATH + System.currentTimeMillis() + "-stream.mp3");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            response.doFinally(
                    signal -> latch.countDown()
            ).subscribe(synthesisResponse -> {
                ByteBuffer byteBuffer = synthesisResponse.getResult().getOutput().getAudio();
                byte[] bytes = new byte[byteBuffer.remaining()];
                byteBuffer.get(bytes);
                try {
                    fos.write(bytes);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            latch.await();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
