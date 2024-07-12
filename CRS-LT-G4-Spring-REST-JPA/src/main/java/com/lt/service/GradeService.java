package com.lt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.lt.dao.GradesDao;
import com.lt.entity.Grades;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Naman, Radha, Ramit, Purnima, Sai, Vignesh
 *
 */
@Repository
@Service
public class GradeService {
	
	@Autowired(required=true)
	private GradesDao gradesDao;
	
	private static final Logger log = LoggerFactory.getLogger(GradeService.class);
	
	/**
	 * @return This method is used to call the DAO layer to fetch all the Grades
	 */
	public List<Grades> viewGrades() {
		log.info("Inside viewGrades method");
		//List<Grades> listTheGrades = new ArrayList<>();
		return (List<Grades>) gradesDao.findAll();
		//return listTheGrades;
		
	}
	
	/**
	 * @param studentId
	 * @return This method is used to call the DAO layer to fetch the grade based on Student ID
	 */
	@Transactional
	public List<Grades> viewGradesBasedOnId(int studentId) {
		log.info("Inside viewGradesBasedOnId method");
	//	Grades gradesObject = gradesDao.findById(studentId);
	//	gradesObject.setStudentId(studentId);
		return gradesDao.findById(studentId);
	}	
	
	

}
