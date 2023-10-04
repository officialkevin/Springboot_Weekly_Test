package com.assignment.Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
class Usertesting{

	void metod(){
		System.out.println("Working");
	}
}

@SpringBootApplication
public class Employee_address {

	public static void main(String[] args) {
		Usertesting u1=new Usertesting();
		u1.metod();
		Imp di=new Imp();
		System.out.println(di.getuser());
		SpringApplication.run(Employee_address.class, args


		);
	}

}
