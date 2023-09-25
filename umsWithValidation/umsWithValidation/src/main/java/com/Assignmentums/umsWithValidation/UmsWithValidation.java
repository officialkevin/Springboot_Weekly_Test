package com.Assignmentums.umsWithValidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
class Usertesting{

	void metod(){
		System.out.println("Working");
	}
}


@SpringBootApplication
public class UmsWithValidation {

	public static void main(String[] args) {
		Usertesting u1=new Usertesting();
		u1.metod();
		SpringApplication.run(UmsWithValidation.class, args);u1.metod();
	}

}
