package com.example.springcloudclient.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@ConfigurationProperties("error-phrases")
@Configuration()
@Getter
@Setter
public class ErrorPhrasesConfig {
    private Map<String, Phrases> keys;

    @Getter
    @Setter
    public static class Phrases {
        private String en;
        private String th;
    }
}
