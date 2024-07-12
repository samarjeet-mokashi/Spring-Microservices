package com.lt.crs.bean;

/**
 * @author Naman,Purnima,Radha,Ramit,Venisraj,Vignesh
 * Bean of enrolledcourses to store enrolledcourses details
 */
public class EnrolledCourses {
	private int studentId;
	private String studentName;
	private int courseId;
	private String courseName;
	private String studentUsername;
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
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the courseId
	 */
	public int getCourseId() {
		return courseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the studentUsername
	 */
	public String getStudentUsername() {
		return studentUsername;
	}
	/**
	 * @param studentUsername the studentUsername to set
	 */
	public void setStudentUsername(String studentUsername) {
		this.studentUsername = studentUsername;
	}
	
}
