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

    @GetMapping("/insert")
    @ResponseBody // bunu yazmazsak return kısmındaki sayfayı döndürmeye çalışır
    public String insert(){
        StudentEntity studentEntity= new StudentEntity(0,"Mustafa","Bulu","Computer Engineering");
        iStudentRepository.save(studentEntity); // 0 ise insert yapıyor 0 dan farklı ise güncelleme yapıyor.
        return "Ogrenci Eklendi:  "+studentEntity.getStudentid() + "  " + studentEntity.getStudentName()+ " " +studentEntity.getStudentSurName() + "  "+studentEntity.getStudentDepartment();
    }






}
