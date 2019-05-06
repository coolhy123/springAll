package com.hydu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages= {"com.hydu.mapper"})
public class MybaitsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MybaitsApp.class, args);

	}

}
