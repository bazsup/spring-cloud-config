package com.example.springcloudclient.controller;

import com.example.springcloudclient.config.AppConfig;
import com.example.springcloudclient.config.ErrorPhrasesConfig;
import com.example.springcloudclient.config.MessageConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    AppConfig configuration;

    @Autowired
    MessageConfig messageConfig;

    @Autowired
    ErrorPhrasesConfig errorPhrasesConfig;

    @GetMapping("/endpoint")
    public String retrieveLimits(){
        return configuration.getValue();
    }

    @GetMapping("/greeting")
    public String getGreeting(){
        return messageConfig.getGreeting();
    }

    @GetMapping("/phrase/{code}")
    public ErrorPhrasesConfig.Phrases getGreeting(@PathVariable String code){
        System.out.println(errorPhrasesConfig.getKeys());
        return errorPhrasesConfig.getKeys().get(code);
    }
}
