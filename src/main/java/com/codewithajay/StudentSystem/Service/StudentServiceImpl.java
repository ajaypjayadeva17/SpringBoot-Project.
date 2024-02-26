package com.codewithajay.StudentSystem.Service;

import com.codewithajay.StudentSystem.Repo.StudentRepo;
import com.codewithajay.StudentSystem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student get(Integer id){
        return studentRepo.findById(id).get();
    }

    public void delete(Integer id){
        studentRepo.deleteById(id);
    }
}
