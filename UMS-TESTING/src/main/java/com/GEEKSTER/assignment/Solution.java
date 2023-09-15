package com.GEEKSTER.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Solution {

	public static void main(String[] args) {

for(int i=0;i<5;i++){
	for(int j=0;j<50;j++){

		if(j<10)System.out.print(" ");
		else {
            System.out.print("x");
        }
		System.out.print(" ");


	}
	System.out.println();
}
		SpringApplication.run(Solution.class, args);
		for(int i=0;i<5;i++){
			for(int j=0;j<50;j++){

				if(j<10)System.out.print(" ");
				else {
					System.out.print("x");
				}
				System.out.print(" ");


			}
			System.out.println();
		}
	}

}
