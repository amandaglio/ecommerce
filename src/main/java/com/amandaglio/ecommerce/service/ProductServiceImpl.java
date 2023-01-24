package com.amandaglio.ecommerce.service;

import com.amandaglio.ecommerce.exception.ProductNotFoundException;
import com.amandaglio.ecommerce.model.Product;
import com.amandaglio.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProducts() {
        Iterable<Product> products = productRepository.findAll();
        return StreamSupport.stream(products.spliterator(), false).toList();
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id)
                .orElseThrow(ProductNotFoundException::new);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
