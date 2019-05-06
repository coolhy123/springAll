package com.hydu.test01.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hydu.entity.Student;

/**
 * 在接口上不加@Mapper 在启动类中要加@MapperScan(basepackges={"com.hydu.mapper"}),否则无法扫描到mapper，多个包以逗号隔开
 * mybatis在接口上加@mapper 就不需要启动类上加@MapperScan
 * @author heyong
 *2019年3月12日-上午11:08:57
 */
public interface StudentMapper01 {
	@Select("SELECT * FROM STUDENT WHERE SNAME = #{sname}")
	Student findByName(@Param("name") String name);
	
	@Insert("INSERT INTO STUDENT(SNAME, SAGE) VALUES(#{sname}, #{sage})")
	int insert(@Param("sname") String sname, @Param("sage") Integer sage);

}
