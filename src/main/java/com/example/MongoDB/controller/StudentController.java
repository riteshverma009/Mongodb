package com.example.MongoDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MongoDB.entity.Student;
import com.example.MongoDB.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	StudentService service;
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		
		return service.createStudent(student);
	}
	
	
	@GetMapping("/getById/{id}")
	public Student getStudentByid(@PathVariable String id) {
		
		return service.getstudentById(id);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudent() {
		
		return service.getAllStudent();
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteStudent(@PathVariable String id) {
		
		return service.DeleteStudent(id);
	}
	
	
	@GetMapping("/getByName/{name}")
	public List<Student> getByName(@PathVariable String name) {
		
		return service.getByName(name);
	}

	@GetMapping("/getByNameAndemail")
	public List<Student> getByNameAndemails(@RequestParam String name,@RequestParam String email) {
		
		return service.getByNameAndemail(name,email);
	}
	
	@GetMapping("/getByNameOremail")
	public List<Student> getByNameoremails(@RequestParam String name,@RequestParam String email) {
		
		return service.getByNameoremails(name,email);
	}
	
	@GetMapping("/AllwithPagination")
	public List<Student> AllwithPagination(@RequestParam int pageNo,@RequestParam int pageSize) {
		
		return service.AllwithPagination(pageNo,pageSize);
	}
	
	@GetMapping("/AllwithSorting")
	public List<Student> AllwithSorting() {
		
		return service.AllwithSorting();
	}
	
	@GetMapping("/bysubjectsName")
	public List<Student> byDepartmentName(@RequestParam String subjectname) {
		
		return service.bysubjectsName(subjectname);
	}

	
	@GetMapping("/likeEmail")
	public List<Student> likeEmail(@RequestParam String likeEmail) {
		
		return service.likeEmail(likeEmail);
	}
	
	@GetMapping("/nameStartWith")
	public List<Student> nameStartWith(@RequestParam String nameStartWith) {
		
		return service.nameStartWith(nameStartWith);
	}
}
