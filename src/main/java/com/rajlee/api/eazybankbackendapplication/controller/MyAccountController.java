package com.rajlee.api.eazybankbackendapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAccountController {

    @GetMapping("/myAccount")
    public String myAcoount(){
        return "Hii you are in my account panel";
    }

}
