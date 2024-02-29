package com.example.students.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.ToLongFunction;

import com.example.students.Entity.Student;
import com.example.students.Repository.StudentRepository;
import org.springframework.stereotype.Service;

;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }
    @Override
    public Student getStudentWithMaxGpa() {
        Optional<Student> studentWithMaxGpa = studentRepository.findAll().stream()
                .max(Comparator.comparingLong((ToLongFunction<? super Student>) Student::getGpa));
        return studentWithMaxGpa.orElse(null);
    }
    @Override
    public Student getStudentWithMinGpa() {
        Optional<Student> studentWithMinGpa = studentRepository.findAll().stream()
                .min(Comparator.comparingLong((ToLongFunction<? super Student>) Student::getGpa));
        return studentWithMinGpa.orElse(null);
    }
    @Override
    public double getAverageGpa() {
        List<Student> students = studentRepository.findAll();
        double totalGpa = students.stream()
                .mapToDouble(Student::getGpa)
                .sum();
        return totalGpa / students.size();
    }


}
