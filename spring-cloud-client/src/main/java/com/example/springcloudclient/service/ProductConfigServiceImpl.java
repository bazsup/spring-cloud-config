package com.example.springcloudclient.service;

import com.example.springcloudclient.model.ProductConfigModel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Setter
@Getter
@ConfigurationProperties("product-config")
public class ProductConfigServiceImpl implements ProductConfigService {

    private List<ProductConfigModel> data;

    @Override
    public List<ProductConfigModel> getAllProductConfig() {
        return data;
    }
}

