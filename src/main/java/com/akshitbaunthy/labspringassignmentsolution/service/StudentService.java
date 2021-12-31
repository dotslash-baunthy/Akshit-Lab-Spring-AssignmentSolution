package com.akshitbaunthy.labspringassignmentsolution.service;

import java.util.List;

import com.akshitbaunthy.labspringassignmentsolution.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    public List<Student> findAll();

    public Student findById(int theId);

    public void save(Student theStudent);

    public void deleteById(int theId);


}
