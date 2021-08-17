package com.uhg.xml.tanmay;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TanmayApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Vehicle my_jet = (Vehicle)context.getBean("jet");
		Vehicle my_car = (Vehicle)context.getBean("car");
		Vehicle my_bike = (Vehicle)context.getBean("bike");
		
		my_jet.run();
		my_car.run();
		my_bike.run();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
