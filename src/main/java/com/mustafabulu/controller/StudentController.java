package com.mustafabulu.controller;

import com.mustafabulu.model.StudentEntity;
import com.mustafabulu.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
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

    //create method
    @PostMapping("/students")
    public StudentEntity createStudent(@RequestBody StudentEntity studentEntity){
        return iStudentRepository.save(studentEntity);
    }






}
