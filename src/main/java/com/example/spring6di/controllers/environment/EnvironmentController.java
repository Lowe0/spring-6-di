package com.example.spring6di.controllers.environment;

import com.example.spring6di.services.environment.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {
    private final EnvironmentService environmentService;

    public EnvironmentController(@Qualifier("environmentService") EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return environmentService.getEnvironment();
    }
}
