package com.example.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyI18NControllerTest {

    @Autowired
    MyI18NController controller;
    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}