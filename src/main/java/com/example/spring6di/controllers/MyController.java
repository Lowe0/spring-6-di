package com.example.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("In the controller");
        return "Hello from the controller.";
    }
}
