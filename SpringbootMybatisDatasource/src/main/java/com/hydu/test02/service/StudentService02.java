package com.hydu.test02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.hydu.test02.mapper.StudentMapper02;



@Service
public class StudentService02 {
	
	@Autowired
	private StudentMapper02 mapper;
	
	@Transactional//����֮��������쳣���������̻�ʧ��
	public int insertStudent(String name,Integer sage) {
		
		int result=mapper.insert(name, sage);
		
		System.out.println("result="+result);
		
		//��ô�����������ɹ���
		return result;
	}

}
