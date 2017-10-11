package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;
@Service
public class StudentManagerImpl implements StudentManager {
	@Autowired
	StudentDao dao;
	
	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}

}
