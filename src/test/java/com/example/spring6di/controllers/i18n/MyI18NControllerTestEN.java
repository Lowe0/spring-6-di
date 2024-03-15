package com.example.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyI18NControllerTestEN {

    @Autowired
    MyI18NController controller;
    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}