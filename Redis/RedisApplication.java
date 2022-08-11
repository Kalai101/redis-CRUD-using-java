package com.samco.Redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class RedisApplication {

	@Bean
	public LettuceConnectionFactory lettuceConnectionfactory() {
	return new LettuceConnectionFactory();
	}
	@Bean
	RedisTemplate redisTemplate() {
		RedisTemplate redisTemplate = new RedisTemplate();
		redisTemplate.setConnectionFactory(lettuceConnectionfactory());
		return redisTemplate;
	}
	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}

}
