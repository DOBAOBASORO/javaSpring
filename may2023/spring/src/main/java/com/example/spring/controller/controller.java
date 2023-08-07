package com.example.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping(value = "/")
    public String homePage(){
        return "Welcome to my First SpringBoot App";
        // Inversion of control: Giving the control to the framework
    }
    @RequestMapping(value = "/electronics")
    public String electronics(){
        return "Electronics";
    }

    @RequestMapping(value = "/video-games")
    public String videoGames(){
        return "Video Games";
    }
}
