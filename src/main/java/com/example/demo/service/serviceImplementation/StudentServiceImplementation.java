package com.example.demo.service.serviceImplementation;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService
{
    @Autowired
    StudentRepository sturep;

    Student createData(Student stu)
    {
        return sturep.save(stu);
    }
    List<Student> fetchRecord()
    {
        return sturep.findAll();
    }
}