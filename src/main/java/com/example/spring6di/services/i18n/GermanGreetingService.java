package com.example.spring6di.services.i18n;

import com.example.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("DE")
@Service("i18NService")
public class GermanGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo, auf Deutsch";
    }
}
