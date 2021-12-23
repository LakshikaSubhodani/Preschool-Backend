package com.preschool.psms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.preschool.psms.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
