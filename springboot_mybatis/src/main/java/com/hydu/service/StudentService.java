package com.hydu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hydu.mapper.StudentMapper;

@Service
public class StudentService {
	
	@Autowired
	private StudentMapper mapper;
	
	@Transactional//����֮��������쳣���������̻�ʧ��
	public int insertStudent(String name,Integer sage) {
		
		int result=mapper.insert(name, sage);
		int i=1/sage;
		System.out.println("result="+result+"    i="+i);
		
		//��ô�����������ɹ���
		return result;
	}

}
