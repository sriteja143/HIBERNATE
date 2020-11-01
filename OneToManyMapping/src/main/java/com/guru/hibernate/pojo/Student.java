package com.guru.hibernate.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8831925081991832279L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long sid;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pid")
	private Passport passport;

	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cid")
	private List<Course> courses;

//	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Course> courses;

	private String name;

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(long sid, Passport passport, List<Course> courses, String name) {
		super();
		this.sid = sid;
		this.passport = passport;
		this.courses = courses;
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", passport=" + passport + ", courses=" + courses + ", name=" + name + "]";
	}

	public Student() {
		super();
	}

}
