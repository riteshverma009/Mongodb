package com.example.MongoDB.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//@Document(collation = "subject")
public class Subject {
//	@Id
//private String id;
	
	@Field(name = "subject_name")
	private String subjectName;
	@Field(name = "marks_obtained")
	private Integer markObtained;
	public String getSubjectNmae() {
		return subjectName;
	}
	public void setSubjectNmae(String subjectName) {
		this.subjectName = subjectName;
	}
	public Integer getMarkObtained() {
		return markObtained;
	}
	public void setMarkObtained(Integer markObtained) {
		this.markObtained = markObtained;
	}
	
	
	
}
