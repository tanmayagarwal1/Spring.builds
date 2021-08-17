package com.uhg.autowired.annotation.tanmay;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AutoWiredAnnotationsApplication {

	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);
		Phone phone = factory.getBean(Phone.class);
		phone.display();
		
		((AnnotationConfigApplicationContext)factory).close();
		
	}

}
