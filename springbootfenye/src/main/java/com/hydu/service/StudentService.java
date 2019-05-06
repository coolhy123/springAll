package com.hydu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hydu.entity.Student;
import com.hydu.mapper.StudentMapper;

/**
 * ��ҳ
 * @author heyong
 *2019��3��12��-����3:54:44
 */
@Service
public class StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	/**
	 * 
	 * @param page ��ǰҳ
	 * @param pagesize ��ǰչʾ����
	 * @return
	 */
	public PageInfo<Student> findStudent(int page,int pageSize){
		//mysql
		PageHelper.startPage(page, pageSize);//ԭ���дsql���
		
		 List<Student> studentlist=studentMapper.findStudent();
		 PageInfo<Student> pageInfoStudent=new PageInfo<Student>(studentlist);
		 return pageInfoStudent;
	}
}
