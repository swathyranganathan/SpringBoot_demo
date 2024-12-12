package com.Spring.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(PracticeApplication.class, args);
		Alien obj = context.getBean(Alien.class);
		obj.code();
	}

}
