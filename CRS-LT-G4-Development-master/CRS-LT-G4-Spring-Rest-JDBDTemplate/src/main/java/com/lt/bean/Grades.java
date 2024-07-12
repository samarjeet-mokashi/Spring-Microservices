package com.lt.bean;

/**
 * @author Naman,Purnima,Radha,Ramit,Sai,Vignesh
 * This bean is used to store the details of the grades.
 */
public class Grades {

	private int studentId;
	private String grade;
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
