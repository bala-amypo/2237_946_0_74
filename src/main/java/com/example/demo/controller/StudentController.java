package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController
{
    @Autowired
    StudentService ser;

    @PostMapping("/createdata")
    public Student createData(@RequestBody Student stu)
    {
        return ser.createData(stu);
    }

    @GetMapping("/fetchrecord")
    public List<Student> fetchRecord()
    {
        return ser.fetchRecord();
    }

    @PutMapping("/updatedatabyid/{id}")
    public String updateDateById(@PathVariable int id,@RequestBody Student stu)
    {

        Optional<Student> student = ser.fetchDataById(id);

        if(student.isPresent()){
            stu.setId(id);
            ser.createData(stu);

            return "Data Updated Successfullt";
        }
        else
        {
            return id + " Not found !";    
        }
    }

    @DeleteMapping("/deletedatabyid/{id}")
    public String deleteDataById(@PathVariable int id)
    {
        Optional<Student> student = ser.fetchDataById(id);

        if(student.isPresent()){
            ser.deleteDataById(id);

            return "Data Deleted Successfully";
        }
        else
        {
            return id + " Not found !";    
        }
    }
}