package com.mythical.rosefinch.business;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mythical.rosefinch.business.mapper")
public class RosefinchBusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(RosefinchBusinessApplication.class, args);
	}

}
