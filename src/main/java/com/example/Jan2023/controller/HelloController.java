package com.example.Jan2023.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//Stating that this is a controller
@RequestMapping("/hello")//Name of the controller
public class HelloController {//controller is the starting point for accepting the requests

    @GetMapping("/greet")
    public String sayHello(){
        return "Welcome to the SpringBoot Framework";
    }

    @GetMapping("/greet/{name}")//{} - indicates that request is coming with an input in the URL
    public String sayHello(@PathVariable("name") String inputName){
        return "Hello "+inputName+", Welcome to the Springboot Framework";
    }



}
