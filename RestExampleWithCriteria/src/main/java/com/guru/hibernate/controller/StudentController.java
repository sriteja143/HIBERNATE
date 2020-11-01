package com.guru.hibernate.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.guru.hibernate.custom.StudentNotFoundExcepion;
import com.guru.hibernate.pojo.Student;
import com.guru.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired StudentService studentsservice;
	Gson gson = new Gson();
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@PostMapping("/save")
	public Student save(@RequestBody Student student) {
		logger.info("Student : {} ",student);
		studentsservice.save(student);
		return student;
		
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Student findById(@PathVariable Long id) throws StudentNotFoundExcepion {
		logger.info("id : {} ",id);
		Student studentoOptional = studentsservice.findById(id);
		if(studentoOptional == null) {
			throw new StudentNotFoundExcepion();
		}
		logger.info("Student :{}",studentoOptional);
		return studentoOptional;
		
	}
}
