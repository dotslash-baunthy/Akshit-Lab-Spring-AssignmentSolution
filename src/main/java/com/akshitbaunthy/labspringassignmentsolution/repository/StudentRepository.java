package com.akshitbaunthy.labspringassignmentsolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshitbaunthy.labspringassignmentsolution.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
