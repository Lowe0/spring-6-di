package com.example.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("environmentService")
public class UATEnvironmentServiceImpl implements EnvironmentService{
    @Override
    public String getEnvironment() {
        return "uat";
    }
}
