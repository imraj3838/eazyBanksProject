package com.rajlee.api.eazybankbackendapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyLoansController {

    @GetMapping("/myLoans")
    public String myLoans(){
        return "Hii you are in my loans panel";
    }

}
