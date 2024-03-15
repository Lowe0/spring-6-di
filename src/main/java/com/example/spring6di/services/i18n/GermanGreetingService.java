package com.example.spring6di.services.i18n;

import com.example.spring6di.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GermanGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo, auf Deutsch";
    }
}
