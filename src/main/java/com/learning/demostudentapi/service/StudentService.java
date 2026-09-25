package com.learning.demostudentapi.service;

import com.learning.demostudentapi.entity.Student;

import java.util.List;

public interface StudentService {

    Student createStudent(Student student);
    List<Student> findAllStudents();
}
