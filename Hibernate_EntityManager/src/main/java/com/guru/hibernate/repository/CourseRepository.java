package com.guru.hibernate.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.guru.hibernate.pojo.Course;

@Repository
public class CourseRepository {

	@Autowired EntityManager em;
	
	public Course findById(Long id){
		Course c = em.find(Course.class, id);;
		
		System.out.println(">>>>>>c.toString(); " + c.toString());
		return c;
	}
	
	
	
}
