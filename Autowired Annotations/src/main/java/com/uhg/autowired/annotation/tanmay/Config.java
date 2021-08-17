package com.uhg.autowired.annotation.tanmay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Phone getPhone() {
		return new Phone();
	}
	
	@Bean
	public Processor getProcessor() {
		return new Snap();
	}

}
