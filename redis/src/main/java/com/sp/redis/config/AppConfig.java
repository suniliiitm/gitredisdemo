package com.sp.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.sp.redis.model.Employee;

@Configuration
public class AppConfig {
	@Bean
	public RedisConnectionFactory rc() {
		return new LettuceConnectionFactory();
		}
	@Bean
	public RedisTemplate<String, Employee> rt(){
	RedisTemplate<String, Employee> temp=new RedisTemplate<String, Employee>();
	temp.setConnectionFactory(rc());
	return temp;
	}
}
