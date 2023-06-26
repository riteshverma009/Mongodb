package com.example.MongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.MongoDB.entity.Department;

@Repository
public interface DepartmentRepo extends MongoRepository<Department, String>  {

}
