package com.example.spring6di.controllers;

import com.example.spring6di.services.GreetingService;
import com.example.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        //this.greetingService = greetingService;
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("In the controller");
        return greetingService.sayGreeting();
    }
}
