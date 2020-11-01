package com.guru.service;

import com.guru.hibernate.pojo.Student;

public interface StudentService {

	String save(Student student);

	Student findById(Long id);
	
}
