package com.example.SpringTestProject;

import com.example.SpringTestProject.Service.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringTestProjectApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringTestProjectApplication.class, args);
		Alien a = context.getBean(Alien.class);
		a.show();
	}

}
