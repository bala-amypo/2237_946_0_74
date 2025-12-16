package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Student 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private float cgpa;

    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public float getCgpa(){
        return cgpa;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setCgpa(float cgpa){
        this.cgpa = cgpa;
    }
    public Student(long id,String name,String email,float cgpa)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }
    public Student(){}
}