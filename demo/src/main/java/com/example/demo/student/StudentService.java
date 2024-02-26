package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(new Student(1L,"ahmed","ahmed@gmail.com", LocalDate.of(2000,5,1),21),new Student(2L,"ahmed","ahmed@gmail.com", LocalDate.of(2000,5,1),21));
    }
}
