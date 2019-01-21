package com.userInfoInterview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.userInfoInterview.controller.UserController;

@SpringBootApplication
public class CrudApp {
	
		public static void main(String[] args) {
			SpringApplication.run(CrudApp.class, args);
		}
}
