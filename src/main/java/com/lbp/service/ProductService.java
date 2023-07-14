package com.lbp.service;

import java.util.List;
import java.util.Map;

import com.lbp.pojo.Product;

public interface ProductService {
    List<Product> getProducts(Map<String, String> params);
    int countProduct();
}
