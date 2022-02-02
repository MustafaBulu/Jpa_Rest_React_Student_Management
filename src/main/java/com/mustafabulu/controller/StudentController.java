package com.mustafabulu.controller;

import com.mustafabulu.model.StudentEntity;
import com.mustafabulu.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {

    @Autowired
    private IStudentRepository iStudentRepository;

    //list method
    //http://localhost:3333/api/v1/students
    @GetMapping("/students")
    public List<StudentEntity> getAllStudents(){
        return iStudentRepository.findAll();
    }




}
