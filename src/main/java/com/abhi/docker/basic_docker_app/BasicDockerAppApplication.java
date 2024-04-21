package com.abhi.docker.basic_docker_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicDockerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicDockerAppApplication.class, args);
		System.out.println("Hello World!");
	}

}
