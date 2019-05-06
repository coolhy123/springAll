package com.hydu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.hydu.entity.Student;
import com.hydu.service.StudentService;

@RestController
public class StudentFenYeController {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/index")
	public PageInfo<Student> findStudent(int page,int pageSize){
		return studentService.findStudent(page, pageSize);
		
	}
	

}
