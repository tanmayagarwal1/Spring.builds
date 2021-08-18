package com.uhg.facilitate.list.objects;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Triangle tri = (Triangle)context.getBean("tri");
		tri.run();
		
		((ClassPathXmlApplicationContext)context).close();
		
		
		
	}

}
