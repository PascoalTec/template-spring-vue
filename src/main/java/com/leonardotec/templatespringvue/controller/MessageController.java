package com.leonardotec.templatespringvue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping ("/api/messages")
public class MessageController {
    @GetMapping(value="/hello")
    public String hello() {
        return "Aplicação Spring";
    }
    @GetMapping(value="/calc")
    public int calc() {
        return 1+2;
    }
    
}
