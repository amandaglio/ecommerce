package com.amandaglio.ecommerce;

import com.amandaglio.ecommerce.model.Product;
import com.amandaglio.ecommerce.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductService productService) {
		return args -> {
			productService.saveProduct(
					new Product(null, "CocaCola 330ml", 0.5D,"https://static.carrefour.es/hd_350x_/img_pim_food/029232_00_1.jpg"));
			productService.saveProduct(new Product(null, "CocaCola 500ml", 0.9D,"https://static.carrefour.es/hd_350x_/img_pim_food/164218_00_1.jpg"));
			productService.saveProduct(new Product(null, "CocaCola 1l", 1.5D,"https://static.carrefour.es/hd_350x_/img_pim_food/339974_00_1.jpg"));
			productService.saveProduct(new Product(null, "CocaCola 1.25l", 1.9D,"https://static.carrefour.es/hd_350x_/img_pim_food/510803_00_1.jpg"));
			productService.saveProduct(new Product(null, "Nestea 330ml", 0.5D,"https://static.carrefour.es/hd_350x_/img_pim_food/316709_00_1.jpg"));
			productService.saveProduct(new Product(null, "Nestea 500ml", 0.9D,"https://static.carrefour.es/hd_350x_/img_pim_food/584102_00_1.jpg"));
		};
	}
}
