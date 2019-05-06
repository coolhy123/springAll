package com.hydu.test01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hydu.test01.mapper.StudentMapper01;

import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
public class StudentService01 {
	
	@Autowired
	private StudentMapper01 mapper;
	
	@Transactional(transactionManager="test2TransactionManager")//����֮��������쳣���������̻�ʧ��
	public int insertStudent(String name,Integer sage) {
		
		int result=mapper.insert(name, sage);
		System.out.println("result="+result);
		
		//��ô�����������ɹ���
		return result;
	}

}
