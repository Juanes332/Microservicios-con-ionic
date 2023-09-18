package com.example.demo;

import com.example.demo.entities.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {
	public static void main(String[] args) {

		Customer asd = new Customer();
		asd.getFirstname();






		SpringApplication.run(SpringbootApplication.class, args);
	}

}
