package com.codewithajay.StudentSystem.Service;

import com.codewithajay.StudentSystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
