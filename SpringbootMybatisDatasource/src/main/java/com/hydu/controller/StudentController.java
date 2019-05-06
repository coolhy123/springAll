package com.hydu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hydu.test01.service.StudentService01;
import com.hydu.test02.service.StudentService02;



@RestController
public class StudentController {

	@Autowired
	private StudentService01 studentService01;
	@Autowired
	private StudentService02 studentService02;
	
	/**
	 * ͨ��get��ʽ��ֵ��ʱ�򣬲����������controller�еĲ���������һ��
	 * @param name
	 * @param sage
	 * @return
	 */
	@RequestMapping("/intStudent01")
	public int insertStudent01(String name,Integer sage) {
		return studentService01.insertStudent(name, sage);
	}
	
	@RequestMapping("/intStudent02")
	public int insertStudent02(String name,Integer sage) {
		return studentService02.insertStudent(name, sage);
	}
}
