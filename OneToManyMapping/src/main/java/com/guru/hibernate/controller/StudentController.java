package com.guru.hibernate.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.guru.hibernate.custom.StudentNotFoundExcepion;
import com.guru.hibernate.pojo.Student;
import com.guru.hibernate.repository.StudentRepository;

@RestController
@Transactional
public class StudentController {
	@Autowired StudentRepository repo;
	Gson gson = new Gson();
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@PostMapping("/save")
	public Student save(@RequestBody Student student) {
		logger.info("Student : {} ",student);
		repo.save(student);
		return student;
		
	}
	
	@GetMapping("/id")
	public @ResponseBody Student findById(@RequestParam Long id) throws StudentNotFoundExcepion {
		logger.info("id : {} ",id);
		Optional<Student> studentoOptional = repo.findById(id);
		if(!studentoOptional.isPresent()) {
			throw new StudentNotFoundExcepion();
		}
		
		Student std = studentoOptional.get();
		logger.info("Student before getting passport :{}",std.getName());
		logger.info("Student passport details  :{}",std.getPassport());
		
		
		return std;
		
	}
}
