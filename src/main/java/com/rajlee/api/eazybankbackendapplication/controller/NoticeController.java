package com.rajlee.api.eazybankbackendapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {

    @GetMapping("/notices")
    public String notices(){
        return "Hii you are in notice panel";
    }

}
