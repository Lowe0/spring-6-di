package com.example.spring6di.controllers;

import com.example.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        propertyInjectedController.sayHello();
    }
}