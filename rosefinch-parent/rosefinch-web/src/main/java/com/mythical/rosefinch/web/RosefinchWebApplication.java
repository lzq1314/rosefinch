package com.mythical.rosefinch.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("org.rosefinch.business.core")
public class RosefinchWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(RosefinchWebApplication.class, args);
	}

}
