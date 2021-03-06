package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.dao")
public class VueSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueSpringbootApplication.class, args);
	}

}
