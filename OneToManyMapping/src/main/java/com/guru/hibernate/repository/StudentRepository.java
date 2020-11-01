package com.guru.hibernate.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.guru.hibernate.pojo.Student;

@EnableJpaRepositories
@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
	
}
