package com.guru.hibernate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.guru.hibernate.pojo.Course;
import com.guru.hibernate.repository.CourseRepository;
import com.guru.hibernate.runners.CourseRunner;


@SpringBootTest(classes = {CourseRunner.class})
class HibernateEntityManagerApplicationTests {

	@MockBean CourseRepository repo;
	@Test
	void contextLoads() {
	}

	@Test
	void testFindById() {
		
		//Course c =repo.findById(10001L);
		//assertEquals("java", c.courseName);
	}
}
