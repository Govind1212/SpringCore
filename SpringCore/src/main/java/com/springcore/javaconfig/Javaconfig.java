package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class Javaconfig {

    @Bean(name = {"student", "st", "stu"})
    public Student getStudent()
    {
        //Creating a new student object
        Student student = new Student(getSamosa());
        return student;
    }

    @Bean
    public Samosa getSamosa()
    {
        return new Samosa();
    }
}
