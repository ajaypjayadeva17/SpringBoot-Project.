package com.codewithajay.StudentSystem.Controller;

import com.codewithajay.StudentSystem.model.Student;
import com.codewithajay.StudentSystem.Service.StudentService;
import com.codewithajay.StudentSystem.Service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudentList(){
        return studentService.getAllStudents();
    }
}
