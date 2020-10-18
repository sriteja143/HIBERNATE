package com.guru.hibernate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.guru.hibernate.pojo.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
	
}
