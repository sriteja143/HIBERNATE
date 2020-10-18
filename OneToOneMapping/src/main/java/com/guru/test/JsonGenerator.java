package com.guru.test;

import com.google.gson.Gson;
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
		
		System.out.println(g.toJson(student));
	}

}
