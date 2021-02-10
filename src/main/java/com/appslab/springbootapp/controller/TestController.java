package com.appslab.springbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/snail")
    public double totalDistance(@RequestParam double stepHeight,
                                @RequestParam double stepLength,
                                @RequestParam double towerHeight) {
        var numOfSteps = towerHeight / stepHeight;
        return numOfSteps * (stepHeight + stepLength);
    }
}
