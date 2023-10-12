package com.weekassignment.rms_Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  Rms_Assignment implements Restaurant {

	@Override
	public void inter() {
		System.out.println("extend");
	}

	public  static void main(String[] args)
	{


		SpringApplication.run(Rms_Assignment.class, args);



	}

}
