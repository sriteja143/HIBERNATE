package com.guru.hibernate.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person implements Serializable{

	@Id
	public Long id;
	public String name;
	public String location;
	public Date brith_date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBrith_date() {
		return brith_date;
	}
	public void setBrith_date(Date brith_date) {
		this.brith_date = brith_date;
	}
	public Person(Long id, String name, String location, Date brith_date) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.brith_date = brith_date;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" + location + ", brith_date=" + brith_date + "]";
	}
	public Person() {
		super();
	}
	
	
}
