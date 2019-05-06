package com.hydu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hydu.entity.Student;
import com.hydu.mapper.StudentMapper;

/**
 * 分页
 * @author heyong
 *2019年3月12日-下午3:54:44
 */
@Service
public class StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	/**
	 * 
	 * @param page 当前页
	 * @param pagesize 当前展示个数
	 * @return
	 */
	public PageInfo<Student> findStudent(int page,int pageSize){
		//mysql
		PageHelper.startPage(page, pageSize);//原理改写sql语句
		
		 List<Student> studentlist=studentMapper.findStudent();
		 PageInfo<Student> pageInfoStudent=new PageInfo<Student>(studentlist);
		 return pageInfoStudent;
	}
}
