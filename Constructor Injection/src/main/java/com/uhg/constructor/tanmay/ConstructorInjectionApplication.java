package com.uhg.constructor.tanmay;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ConstructorInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Brand brand = (Brand) context.getBean("brand");
		System.out.println(brand);
		
		((ClassPathXmlApplicationContext)context).close();
		
  		
	}

}
