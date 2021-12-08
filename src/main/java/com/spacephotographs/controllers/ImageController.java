package com.spacephotographs.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/images")
public class ImageController {
    @GetMapping("")
    public String getImages() {
        return "images";
    }
}
