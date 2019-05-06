package com.hydu.test01.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hydu.entity.Student;

/**
 * �ڽӿ��ϲ���@Mapper ����������Ҫ��@MapperScan(basepackges={"com.hydu.mapper"}),�����޷�ɨ�赽mapper��������Զ��Ÿ���
 * mybatis�ڽӿ��ϼ�@mapper �Ͳ���Ҫ�������ϼ�@MapperScan
 * @author heyong
 *2019��3��12��-����11:08:57
 */
public interface StudentMapper01 {
	@Select("SELECT * FROM STUDENT WHERE SNAME = #{sname}")
	Student findByName(@Param("name") String name);
	
	@Insert("INSERT INTO STUDENT(SNAME, SAGE) VALUES(#{sname}, #{sage})")
	int insert(@Param("sname") String sname, @Param("sage") Integer sage);

}
