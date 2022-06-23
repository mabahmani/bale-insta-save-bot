package com.mabahmani.baleinstasavebot.controller;

import com.mabahmani.baleinstasavebot.BaleInstaSaveBotApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String getToken(){
        return BaleInstaSaveBotApplication.botToken;
    }
}
