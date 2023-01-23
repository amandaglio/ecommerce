package com.amandaglio.ecommerce.service;

import com.amandaglio.ecommerce.model.Product;
import com.amandaglio.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional getProduct(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
