package com.uhg.autowired.annotation.pizza.tanmay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Pizza getPizza() {
		return new Pizza();
	}
	
	@Bean 
	public Cheese getMozarella() {
		return new Mozarella();
	}
	


}
