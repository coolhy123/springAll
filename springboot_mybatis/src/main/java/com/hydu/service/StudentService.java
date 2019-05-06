package com.hydu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hydu.mapper.StudentMapper;

@Service
public class StudentService {
	
	@Autowired
	private StudentMapper mapper;
	
	@Transactional//开启之后如果有异常，整个过程会失败
	public int insertStudent(String name,Integer sage) {
		
		int result=mapper.insert(name, sage);
		int i=1/sage;
		System.out.println("result="+result+"    i="+i);
		
		//怎么检验事务开启成功了
		return result;
	}

}
