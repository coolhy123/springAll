package com.hydu.test02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.hydu.test02.mapper.StudentMapper02;



@Service
public class StudentService02 {
	
	@Autowired
	private StudentMapper02 mapper;
	
	@Transactional//开启之后如果有异常，整个过程会失败
	public int insertStudent(String name,Integer sage) {
		
		int result=mapper.insert(name, sage);
		
		System.out.println("result="+result);
		
		//怎么检验事务开启成功了
		return result;
	}

}
