package com.company.SampleProject.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${spring.security.user.name}")
    private String username;

    @GetMapping("/")
    public String getHelloGreeting(){
        return "Hello "+ username +". Welcome to the web page";
    }
}
