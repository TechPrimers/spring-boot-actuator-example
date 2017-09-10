package com.techprimers.health.actuatorexample;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

@Component
public class CustomEndPoint implements Endpoint<String>{
    @Override
    public String getId() {
        return "youtube";
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean isSensitive() {
        return false;
    }

    @Override
    public String invoke() {
        return "Hello Youtube";
    }
}
