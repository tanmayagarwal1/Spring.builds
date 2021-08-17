package com.uhg.autowired.annotation.pizza.tanmay;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);
		Pizza my_pizza = factory.getBean(Pizza.class);
		my_pizza.make();
	}

}
