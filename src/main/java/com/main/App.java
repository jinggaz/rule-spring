package com.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	@Value("${test}")
	private static String t;

	public static void main(String[] args) throws Exception {

		SpringApplication.run(App.class, args);

		test();
	}

	private static void test() throws Exception {
		System.out.println("\n\n String t is " + t);


	}

}
