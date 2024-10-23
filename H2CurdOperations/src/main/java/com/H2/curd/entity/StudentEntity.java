package com.H2.curd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentEntity {
	@Id
	@GeneratedValue
private int id;
private String name;
private String address;
}
