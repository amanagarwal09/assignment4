package com.cognizant.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.model.Student;

@Repository
public interface StudentDao {
	String insert(Student student);

	String delete(int id);

	String update(Student student);

	List<Student> getAll();
}
