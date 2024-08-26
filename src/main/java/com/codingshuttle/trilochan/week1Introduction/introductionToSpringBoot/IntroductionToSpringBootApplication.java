package com.codingshuttle.trilochan.week1Introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.System;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

//	Apple obj;

	@Autowired
	DBService dbService;
	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
//		obj.eatApple();
		System.out.println(dbService.getData());
	}
}
