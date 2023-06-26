package com.example.MongoDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.MongoDB.entity.Student;
import com.example.MongoDB.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repository;

	public Student createStudent(Student student) {

		return repository.save(student);

	}

	public Student getstudentById(String id) {
		if (repository.findById(id).isPresent()) {
			return repository.findById(id).get();

		} else {
			return null;

		}

	}

	public List<Student> getAllStudent() {
		return repository.findAll();
	}

	public Student updateStudent(Student student) {
		return repository.save(student);
	}

	public String DeleteStudent(String id) {
		repository.deleteById(id);
		return "student deleted";
	}

	public List<Student> getByName(String name) {
		return repository.findByName(name);
	}

	public List<Student> getByNameAndemail(String name, String email) {
		return repository.findByEmailAndName(email, name);
	}

	public List<Student> getByNameoremails(String name, String email) {
		return repository.findByEmailOrName(email, name);
	}

	public List<Student> AllwithPagination(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		return repository.findAll(pageable).getContent();
	}

	public List<Student> AllwithSorting() {
		Sort sort = Sort.by(Sort.Direction.DESC, "name");
		return repository.findAll(sort);
	}

	public List<Student> byDepartmentName(String departmentName) {
		return repository.findByDepartmentDepartmentName(departmentName);
	}

	public List<Student> bysubjectsName(String subjectname) {
		return repository.findBySubjectsSubjectName(subjectname);
	}

	public List<Student> likeEmail(String likeEmail) {
		return repository.findByEmailIsLike(likeEmail);
	}

	public List<Student> nameStartWith(String nameStartWith) {
		return repository.findByNameStartsWith(nameStartWith);
	}

}
