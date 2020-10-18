package com.guru.hibernate.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	public String courseName;
	
	public int cost;

	public Course(String courseName, int cost) {
		super();
		this.courseName = courseName;
		this.cost = cost;
	}

	public Course() {
		super();
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", cost=" + cost + "]";
	}
	
	
}
