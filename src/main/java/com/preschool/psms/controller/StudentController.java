package com.preschool.psms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.preschool.psms.model.Student;
import com.preschool.psms.repository.StudentRepository;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	//get all students
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		return studentRepository.findAll();	
	}
}
