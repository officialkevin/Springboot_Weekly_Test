package com.test.Ecomerceapitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
class Bet{
	void call(){
		System.out.println("ys");
	}
}
@SpringBootApplication
public class Ecommercetestclass {

	public static void main(String[] args) {Bet n=new Bet();
		n.call();
		SpringApplication.run(Ecommercetestclass.class, args);
	}

}
