package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(HelloworldApplication.class, args);
		HelloBean helloBean = ctx.getBean(HelloBean.class);

		System.out.println(helloBean.sayHello());
	}
}
