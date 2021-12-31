package com.akshitbaunthy.labspringassignmentsolution.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.akshitbaunthy.labspringassignmentsolution.entity.Student;
import com.akshitbaunthy.labspringassignmentsolution.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Transactional
    public List<Student> findAll() {

        return studentRepository.findAll();
    }

    @Transactional
    public Student findById(int id) {

        // find record with Id from the database table

        return studentRepository.findById(id).get();
    }

    @Transactional
    public void save(Student theStudent) {

        studentRepository.save(theStudent);

    }

    @Transactional
    public void deleteById(int id) {

        studentRepository.deleteById(id);

    }

}