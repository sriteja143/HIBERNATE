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


	private String name;

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}

	public Student(long sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	public Student() {
		super();
	}

}
