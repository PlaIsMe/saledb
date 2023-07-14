package com.lbp.repository;

import java.util.List;
import java.util.Map;

import com.lbp.pojo.Product;

public interface ProductRepository {
    List<Product> getProducts(Map<String, String> params);
    int countProduct();
}
