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
	 * ͨ��get��ʽ��ֵ��ʱ�򣬲����������controller�еĲ���������һ��
	 * @param name
	 * @param sage
	 * @return
	 */
	@RequestMapping("/intStudent")
	public int insertStudent(String name,Integer sage) {
		return studentService.insertStudent(name, sage);
	}
}
