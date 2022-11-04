package com.example.springcloudclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@ConfigurationProperties("error-phrases")
@Configuration()
public class ErrorPhrasesConfig {
    private Map<String, Phrases> keys;

    public Map<String, Phrases> getKeys() {
        return keys;
    }

    public void setKeys(Map<String, Phrases> keys) {
        this.keys = keys;
    }

    public static class Phrases {
        private String en;
        private String th;

        public String getEn() {
            return en;
        }

        public void setEn(String en) {
            this.en = en;
        }

        public String getTh() {
            return th;
        }

        public void setTh(String th) {
            this.th = th;
        }
    }
}
