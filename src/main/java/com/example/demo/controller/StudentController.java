package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService src;
    @PostMapping("/addStudent")
    public StudentEntity addstudent(@RequestBody StudentEntity student){

        return src.saveStudentData(student);
    }
    
    @GetMapping("/getStudent")
    public List<StudentEntity> getallstudents(){
        return src.retrieveAllStudents();
    }
    
    @GetMapping("/getStudentById/{id}")
    public StudentEntity getIdVal(@PathVariable int id){
        return src.retrieveStudentData(id);
    }
    
    @PutMapping("/updateStudentDate/{id}")
    public StudentEntity updateStudentData(@PathVariable int id, @RequestBody StudentEntity student){
        return src.updateStudentData(id,student);
    }

    @DeleteMapping("/deleteStudents/{id}")
    public StudentEntity deleteStudentData(@PathVariable int id){
       return  src.deleteStudentData(id);
    }
}