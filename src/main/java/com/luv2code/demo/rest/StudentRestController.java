package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import com.luv2code.demo.exceptions.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student> studentList = new ArrayList<>();

    @PostConstruct
    public void loadData()
    {
        studentList.add(new Student("Nitish","Kumar"));
        studentList.add(new Student("XZZA","SDFG"));
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable("id") int studentId) throws StudentNotFoundException {
        Student tempStudent = null; //studentList.get(studentId);
        if(tempStudent == null) {
            System.out.println("Inside exception condition...");
            throw new StudentNotFoundException("Student not available");
        }
        return studentList.get(studentId);
    }
}
