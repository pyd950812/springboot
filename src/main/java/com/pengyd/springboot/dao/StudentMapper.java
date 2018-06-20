package com.pengyd.springboot.dao;

import com.pengyd.springboot.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author pengyd
 * @Date 2018/6/19 11:45
 * @function:
 */
@Mapper
public interface StudentMapper {

    @Select("Select * from t_student where name = #{name} ")
    Student findUserByName(@Param("name") String name);

    @Insert("insert into t_student(name,password,phone) values(#{name},#{password},#{phone})")
    int insert(@Param("name") String name, @Param("password") String password, @Param("phone") String phone);
}
