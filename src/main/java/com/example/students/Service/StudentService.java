package com.example.students.Service;

import com.example.students.Entity.Student;

import java.util.List;


public interface StudentService {

    Student getStudentWithMaxGpa();
    Student getStudentWithMinGpa();
    double getAverageGpa();


}
