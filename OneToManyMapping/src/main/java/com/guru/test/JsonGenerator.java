package com.guru.test;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.guru.hibernate.pojo.Course;
import com.guru.hibernate.pojo.Passport;
import com.guru.hibernate.pojo.Student;

public class JsonGenerator {
	
	public static void main(String[] args) {
		Gson g = new Gson();
		
		Student student = new Student();
		
		Passport passport = new Passport();
		passport.setNumber("E123456");
		
		student.setPassport(passport);
		student.setName("GURU");
		
		Course course = new Course();
		course.cost = 1000;
		course.courseName = "Springboot";
		
		List<Course> courses=new ArrayList<>();
		courses.add(course);
		student.setCourses(courses);
		System.out.println(g.toJson(student));
	}

}
