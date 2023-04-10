package com.project.wineshop.service;

import com.project.wineshop.model.Product;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Map;

public interface ProductService {
    Product save(Product product);

    Product getById(Long id);

    List<Product> findAll();

    List<Product> findAll(PageRequest pageRequest);

    List<Product> findAll(Map<String, String> params);

    Product update(Long id, Product product);

    void deleteById(Long id);
}
