package com.guru.hibernate.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.guru.hibernate.repository.CourseRepository;

@Component
public class CourseRunner implements CommandLineRunner {

	@Autowired CourseRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(">>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(">>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(">>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(">>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<");
		repo.findById(10001L);

	}

}
