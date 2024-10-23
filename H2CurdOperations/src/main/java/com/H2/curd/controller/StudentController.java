package com.H2.curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.H2.curd.entity.StudentEntity;
import com.H2.curd.service.StudentService;

@RestController
public class StudentController {

	@Autowired StudentService studentservice;
	
	@PostMapping("/add")
	public StudentEntity addStudentEntity(@RequestBody StudentEntity studententity) {
		return studentservice.addStudentEntity(studententity);
	}
	
	public List<StudentEntity> addStudentsEntity(@RequestBody List<StudentEntity> studentsentity ){
		return studentservice.addStudentsEntity(studentsentity);
	}
	
}
