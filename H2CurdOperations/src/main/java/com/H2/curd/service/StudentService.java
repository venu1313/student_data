package com.H2.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.H2.curd.entity.StudentEntity;
import com.H2.curd.repository.StudentRepository;

@Service
public class StudentService {
@Autowired StudentRepository studentrepo;


public StudentEntity addStudentEntity(StudentEntity student) {
	return studentrepo.save(student);
}
  
public List<StudentEntity> addStudentsEntity(List<StudentEntity> studentsentity){
	//students details store to db
	return studentrepo.saveAll(studentsentity);
}



}
