package com.uhg.facilitate.objects;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ObjectsApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Shape tri = (Shape) context.getBean("tri");
		Shape sq = (Shape) context.getBean("sq");
		Shape rect = (Shape)context.getBean("rect");
		tri.run();
		rect.run();
		sq.run();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
