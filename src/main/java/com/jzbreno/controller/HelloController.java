package com.jzbreno.controller;

import com.jzbreno.service.HelloWorldService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {

    private HelloWorldService helloWorldService;

    HelloController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/hello/{name}")
    public String Hello(@PathVariable String name){

        return helloWorldService.sayHello(name);
    }

}
