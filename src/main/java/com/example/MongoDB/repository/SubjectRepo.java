package com.example.MongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.MongoDB.entity.Subject;

public interface SubjectRepo extends MongoRepository<Subject, String> {

}
