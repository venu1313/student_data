package com.H2.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.H2.curd.entity.StudentEntity;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
