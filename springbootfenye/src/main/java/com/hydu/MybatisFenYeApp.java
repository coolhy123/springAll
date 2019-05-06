package com.hydu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@MapperScan(basePackages= {"com.hydu.mapper"})
public class MybatisFenYeApp {
	public static void main(String[] args) {
		SpringApplication.run(MybatisFenYeApp.class, args);
	}
}
