package com.example.mybatis.mapper;

import com.example.mybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    public List<Student> findAllStudent();

    List<Student> findStudentByno(int no);
}

