package com.shop.common;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.shop.common" })
public class Test {

	public static void main(String[] args) throws IOException {
		
		SpringApplication.run(Test.class, args);
	}
	
}
