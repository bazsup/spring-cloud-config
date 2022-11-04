package com.example.springcloudclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("message")
@Configuration
public class MessageConfig {
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String value) {
        this.greeting = value;
    }
}
