package com.amandaglio.ecommerce.controller;

import com.amandaglio.ecommerce.model.Product;
import com.amandaglio.ecommerce.service.ProductService;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        Iterable<Product> iterableProducts = productService.getProducts();
        return IterableUtils.toList(iterableProducts);
    }

    @GetMapping(value = "/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productService.getProduct(id).get();
    }
}
