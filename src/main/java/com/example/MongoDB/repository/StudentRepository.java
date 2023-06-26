package com.example.MongoDB.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.MongoDB.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{

	
	List<Student> findByName(String name);
	
	List<Student> findByEmailAndName(String name,String email);
	List<Student> findByEmailOrName(String email,String name);
	
	List<Student> findByDepartmentDepartmentName(String department);

	
	List<Student> findBySubjectsSubjectName(String name);
	
	List<Student> findByEmailIsLike(String email);
	
	List<Student> findByNameStartsWith(String name);
}


