package com.Url.Counter.Assignment.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication




public class Urlapp {
	public static void method(){
System.out.println("      _                                  _                                  _   \n" +
		"     | |                                (_)                                | |  \n" +
		"   __| | ___  _ __   ___    __ _ ___ ___ _  __ _ _ __  _ __ ___   ___ _ __ | |_ \n" +
		"  / _` |/ _ \\| '_ \\ / _ \\  / _` / __/ __| |/ _` | '_ \\| '_ ` _ \\ / _ \\ '_ \\| __|\n" +
		" | (_| | (_) | | | |  __/ | (_| \\__ \\__ \\ | (_| | | | | | | | | |  __/ | | | |_ \n" +
		"  \\__,_|\\___/|_| |_|\\___|  \\__,_|___/___/_|\\__, |_| |_|_| |_| |_|\\___|_| |_|\\__|\n" +
		"                                            __/ |                               \n" +
		"                                           |___/                                ");
	}

	public static void main(String[] args) {


		method();
		SpringApplication.run(Urlapp.class, args);
	method();
	}

}
