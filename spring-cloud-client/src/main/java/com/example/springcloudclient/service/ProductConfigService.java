package com.example.springcloudclient.service;

import com.example.springcloudclient.model.ProductConfigModel;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface ProductConfigService {
    List<ProductConfigModel> getAllProductConfig();
}
