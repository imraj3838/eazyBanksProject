package com.rajlee.api.eazybankbackendapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyBalanceController {

    @GetMapping("/myBalance")
    public String myBalance(){
        return "Hii you are in my balance panel";
    }

}
