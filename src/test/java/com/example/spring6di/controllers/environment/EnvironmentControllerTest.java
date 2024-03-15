package com.example.spring6di.controllers.environment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EnvironmentControllerTest {
    @Autowired
    EnvironmentController controller;

    @Test
    void getEnvironment() {
        System.out.println("Current environment: " + controller.getEnvironment());
    }
}