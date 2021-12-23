package com.preschool.psms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="student_Id")
	private String studentId;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="initial_name")
	private String initialName;
	
	@Column(name="class")
	private String className;
	
	public Student() {
		
	}
	
	public Student(String studentId, String fullName, String initialName, String className) {
		super();
		this.studentId = studentId;
		this.fullName = fullName;
		this.initialName = initialName;
		this.className = className;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getInitialName() {
		return initialName;
	}
	public void setInitialName(String initialName) {
		this.initialName = initialName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	
}
