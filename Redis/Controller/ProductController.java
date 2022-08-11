package com.samco.Redis.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samco.Redis.Model.Product;
import com.samco.Redis.Repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductRepository productRepo;

	@PostMapping("/products")
	public Product saveProducts(@RequestBody Product product) {
		productRepo.saveProducts(product);
		return product;
	}
		@GetMapping("/products") 
		public List<Product> findAll(){
			return productRepo.findAll();
		}
	}

