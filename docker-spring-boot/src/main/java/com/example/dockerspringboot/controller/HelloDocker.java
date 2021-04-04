package com.example.dockerspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDocker {
    @GetMapping("/hello/docker")
    public String helloDocker(){
        return "Hello";
    }
}
