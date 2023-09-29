package com.Assignment.UEM_App;

//import com.Assignment.UEM_App.Service.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 class Works{

	public static void method(){
		System.out.println("done");
	}

}

@SpringBootApplication
public class UEM_Application {

	public static void main(String[] args) {

Works.method();
		SpringApplication.run(UEM_Application.class, args);

		Works.method();
	}

}
