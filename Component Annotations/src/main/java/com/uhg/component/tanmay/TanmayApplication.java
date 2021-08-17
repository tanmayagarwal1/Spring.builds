package com.uhg.component.tanmay;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TanmayApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Vehicle my_vehicle = (Vehicle)context.getBean("jet");
		my_vehicle.run();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
