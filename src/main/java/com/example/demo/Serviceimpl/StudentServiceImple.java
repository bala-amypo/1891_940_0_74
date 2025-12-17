package com.example.demo.serviceimpl;

import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.Student;
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    public Student saveStudent(Student student){
        return studentRepository.save()
    }
    
}
