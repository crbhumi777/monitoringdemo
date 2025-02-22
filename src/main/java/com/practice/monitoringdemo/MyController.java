package com.practice.monitoringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    String sayHello() {
        return "hello world!!!";
    }
}

//bulid docker images using maven jib plugin