package com.rashaddavis.Studentsystem.service;

import com.rashaddavis.Studentsystem.model.Student;
import com.rashaddavis.Studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
