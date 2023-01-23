package com.amandaglio.ecommerce.service;

import com.amandaglio.ecommerce.model.Product;

import java.util.Optional;

public interface ProductService {
    public Iterable<Product> getProducts();
    public Optional<Product> getProduct(Long id);
    public Product saveProduct(Product product);
}
