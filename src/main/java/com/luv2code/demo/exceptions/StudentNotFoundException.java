package com.luv2code.demo.exceptions;

public class StudentNotFoundException extends Throwable {
    public StudentNotFoundException(String studentNotAvailable) {
        super(studentNotAvailable);
    }
}
