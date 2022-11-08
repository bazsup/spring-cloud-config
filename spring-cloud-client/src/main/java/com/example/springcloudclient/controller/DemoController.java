package com.example.springcloudclient.controller;

import com.example.springcloudclient.config.AppConfig;
import com.example.springcloudclient.config.ErrorPhrasesConfig;
import com.example.springcloudclient.config.MessageConfig;
import com.example.springcloudclient.model.ProductConfigModel;
import com.example.springcloudclient.service.ProductConfigService;
import com.example.springcloudclient.service.ProductConfigServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.CompositePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Properties;

@RestController
@RefreshScope
public class DemoController {
    @Autowired
    AppConfig configuration;

    @Autowired
    MessageConfig messageConfig;

    @Autowired
    ErrorPhrasesConfig errorPhrasesConfig;

    @Autowired
    ProductConfigService productConfigService;

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

//    @Value("${product-config:[]}")
//    List<ProductConfigModel> allProductConfig;
//
    @GetMapping("/product-config")
    public List<ProductConfigModel> getAllProductConfig() {
        return productConfigService.getAllProductConfig();
    }

}
