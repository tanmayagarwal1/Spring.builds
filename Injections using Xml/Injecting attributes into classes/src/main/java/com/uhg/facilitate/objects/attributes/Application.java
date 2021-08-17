package com.uhg.facilitate.objects.attributes;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		//NonConstructorBased obj = (NonConstructorBased) context.getBean("NC");
		ConstructorBased con_obj = (ConstructorBased) context.getBean("CC");
		//obj.run();
		con_obj.run();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
