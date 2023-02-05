package com.greatelearning.srs.service;

import java.util.List;

import com.greatelearning.srs.entity.Student;

public interface StudentService {
	List<Student> listAll();

	void save(Student student);
	
	Student	findById(int id);
	
	void deleteById(int id);
}
