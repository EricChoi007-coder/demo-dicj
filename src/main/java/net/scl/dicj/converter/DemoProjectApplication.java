package net.scl.dicj.converter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoProjectApplication {

	public static void main(String[] args) {


		SpringApplication.run(DemoProjectApplication.class, args);
		//Active AOP Function
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationAppConfig.class);
	}

}
