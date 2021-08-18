package com.uhg.list.metadata.inheritence;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		//Tri tri = (Tri) context.getBean("parentTri");
		//tri.run();
		
		//((ClassPathXmlApplicationContext)context).close();
		
		
		System.out.println("Done");
	}

}
