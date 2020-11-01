package com.guru.hibernate.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passport implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4417730836983771443L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pid;
	
	private String number;

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Passport [pid=" + pid + ", number=" + number + "]";
	}

	public Passport() {
		super();
	}
	
	
}
