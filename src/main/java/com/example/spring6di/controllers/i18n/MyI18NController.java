package com.example.spring6di.controllers.i18n;

import com.example.spring6di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyI18NController {
    private final GreetingService greetingService;

    public MyI18NController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
