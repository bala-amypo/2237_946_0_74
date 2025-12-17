package com.example.demo.service;

@Service
public interface StudentService
{
    Student createData(Student stu);
    List<Student> fetchRecord();
}