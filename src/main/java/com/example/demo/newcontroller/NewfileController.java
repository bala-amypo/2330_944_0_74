package com.example.demo.newcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.newentity.NewFileEntity;
import com.example.demo.newservice.NewfileService;

@RestController
public class NewFileController{
    @Autowired
    NewfileService src;
    @PostMapping("/addStudent")
    public NewFileEntity addstudent(@RequestBody Studententity student){

        return src.saveStudentData(student);
    }
    
    @GetMapping("/getStudent")
    public List<Studententity> getallstudents(){
        return src.retrieveAllStudents();
    }
    
    @GetMapping("/getStudentById/{id}")
    public Studententity getIdVal(@PathVariable int id){
        return src.retrieveStudentData(id);
    }
    
    @PutMapping("/updateStudentDate/{id}")
    public Studententity updateStudentData(@PathVariable int id, @RequestBody Studententity student){
        return src.updateStudentData(id,student);
    }

    @DeleteMapping("/deleteStudents/{id}")
    public Studententity deleteStudentData(@PathVariable int id){
       return  src.deleteStudentData(id);
    }
}