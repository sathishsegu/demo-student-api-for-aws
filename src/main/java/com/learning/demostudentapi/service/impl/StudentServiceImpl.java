package com.learning.demostudentapi.service.impl;

import com.learning.demostudentapi.entity.Student;
import com.learning.demostudentapi.repository.StudentRepository;
import com.learning.demostudentapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        return  studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }
}
