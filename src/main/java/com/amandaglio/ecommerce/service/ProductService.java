package com.amandaglio.ecommerce.service;

import com.amandaglio.ecommerce.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getProducts();
    public Product getProduct(Long id);
    public Product saveProduct(Product product);
}
