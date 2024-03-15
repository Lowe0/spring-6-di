package com.example.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service("environmentService")
public class ProdEnvironmentServiceImpl implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "PROD";
    }
}
