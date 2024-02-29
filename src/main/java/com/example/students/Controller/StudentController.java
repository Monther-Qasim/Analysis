package com.example.students.Controller;

import com.example.students.Entity.Student;
import com.example.students.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    @GetMapping("/data")
    public String maxAndMinGpaStudents(Model model) {
        Student maxGpaStudent = studentService.getStudentWithMaxGpa();
        Student minGpaStudent = studentService.getStudentWithMinGpa();
        double avgGpaStudent = studentService.getAverageGpa();

        model.addAttribute("avgGpaStudent", avgGpaStudent);
        model.addAttribute("maxGpaStudent", maxGpaStudent);
        model.addAttribute("minGpaStudent", minGpaStudent);
        model.addAttribute("maxGpaMessage", maxGpaStudent != null ? "The student with the highest GPA in the class was awarded the academic excellence prize." : "");
        model.addAttribute("minGpaMessage", minGpaStudent != null ? "The student with the lowest GPA in the class was expelled from the class." : "");

        String avgGpaMessage = avgGpaStudent > 0 ? "The class average GPA is " + avgGpaStudent + "." : "There are no students in the class.";
        model.addAttribute("avgGpaMessage", avgGpaMessage);

        return "students";
    }
}