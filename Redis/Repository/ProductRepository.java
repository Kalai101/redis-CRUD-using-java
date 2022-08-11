package com.samco.Redis.Repository;

import java.util.List;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.samco.Redis.Model.Product;

@Repository
public class ProductRepository {
	private HashOperations hashOperations;
	private RedisTemplate redisTemplate;
	
	public ProductRepository(RedisTemplate redisTemplate) {
		this.hashOperations = redisTemplate.opsForHash();
		this.redisTemplate = redisTemplate;
	}
	public List<Product> findAll(){
		return hashOperations.values("product");
	}
	public void saveProducts(Product product) {
		hashOperations.put("product", "product", product);
	}
}
