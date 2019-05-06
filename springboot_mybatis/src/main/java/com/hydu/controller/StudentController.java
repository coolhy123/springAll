package com.hydu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hydu.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	/**
	 * 通过get方式传值的时候，参数名必须和controller中的参数名保持一至
	 * @param name
	 * @param sage
	 * @return
	 */
	@RequestMapping("/intStudent")
	public int insertStudent(String name,Integer sage) {
		return studentService.insertStudent(name, sage);
	}
}
