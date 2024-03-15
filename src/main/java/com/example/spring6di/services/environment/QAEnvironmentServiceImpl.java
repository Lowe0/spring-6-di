package com.example.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("environmentService")
public class QAEnvironmentServiceImpl implements EnvironmentService{
    @Override
    public String getEnvironment() {
        return "qa";
    }
}
