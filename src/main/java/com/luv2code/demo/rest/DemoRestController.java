package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/test")
public class DemoRestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/student")
    public Student getStudent()
    {
        return new Student("Nitish","Kumar");
    }

    @GetMapping("/students")
    public List<Student> getAllStudent()
    {
        return Arrays.asList(new Student("Nitish","Kumar"),new Student("Ram","Kapoor"));
    }
}
