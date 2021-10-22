package com.example.mybatis.controller;

import com.example.mybatis.entity.Student;
import com.example.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Student")
class UserController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/getAllStudent")
    public List<Student> findAll(){
        return studentService.findAllStudent();
    }

    @RequestMapping("/getStudentByno/{no}")
    public List<Student> findUserByStudentId(@PathVariable int no){
        return studentService.findStudentByno(no);
    }
}

