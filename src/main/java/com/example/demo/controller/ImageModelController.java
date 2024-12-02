package com.example.demo.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.ai.image.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * TODO
 *
 * @author jqiang
 * 2024/12/02 11:35
 */
@RestController
@RequestMapping("/ai")
public class ImageModelController {

    private final ImageModel imageModel;

    ImageModelController(ImageModel imageModel) {
        this.imageModel = imageModel;
    }

    @GetMapping("/image")
    public void image(@RequestParam("input") String input, HttpServletResponse response) {

         ImageOptions options = ImageOptionsBuilder.builder()
         		.withModel("wanx-v1")
         		.build();
         ImagePrompt imagePrompt = new ImagePrompt(input, options);

//        ImagePrompt imagePrompt = new ImagePrompt(input);
        ImageResponse imageResponse = imageModel.call(imagePrompt);
        String imageUrl = imageResponse.getResult().getOutput().getUrl();

        try {
            URL url = new URL(imageUrl);
            InputStream in = url.openStream();

            response.setHeader("Content-Type", MediaType.IMAGE_PNG_VALUE);
            response.getOutputStream().write(in.readAllBytes());
            response.getOutputStream().flush();
        } catch (IOException e) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }

}
