package com.instagram.Instagram;

import com.instagram.Instagram.INstagram.Instauser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Instagram {

	public static void main(String[] args) {
		SpringApplication.run(Instagram.class, args);
		Instauser iu=new Instauser();
		Scall sc=new Scall();Scall.overRide(iu);

	}


}
