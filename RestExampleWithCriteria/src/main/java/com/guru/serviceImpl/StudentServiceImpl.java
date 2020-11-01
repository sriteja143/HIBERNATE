package com.guru.serviceImpl;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guru.hibernate.pojo.Student;
import com.guru.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired EntityManager entityManager;
	
	@Override
	public String save(Student student) {
		try {
			entityManager.persist(student);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Success";
	}

	@Override
	public Student findById(Long id) {
		Session session = entityManager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("sid", id));
		return (Student) criteria.uniqueResult();
	}

}
