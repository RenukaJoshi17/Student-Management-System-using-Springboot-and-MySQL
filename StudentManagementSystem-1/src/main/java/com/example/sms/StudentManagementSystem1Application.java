package com.example.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan("com.example.sms.service.StudentService")

public class StudentManagementSystem1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystem1Application.class, args);
	}

}
