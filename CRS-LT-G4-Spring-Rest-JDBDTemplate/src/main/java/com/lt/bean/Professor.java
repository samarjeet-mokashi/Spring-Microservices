package com.lt.bean;

/**
 * @author Naman, Purnima, Radha, Ramit, Sai, Vignesh
 * Bean of professor to store professor details
 *
 */
public class Professor {
	private int professorId;
	private String professorName;
	private String professorPass;
	/**
	 * @return the professorId
	 */
	public int getProfessorId() {
		return professorId;
	}
	/**
	 * @param professorId the professorId to set
	 */
	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}
	/**
	 * @return the professorName
	 */
	public String getProfessorName() {
		return professorName;
	}
	/**
	 * @param professorName the professorName to set
	 */
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	/**
	 * @return
	 */
	public String getProfessorPass() {
		return professorPass;
	}
	/**
	 * @param professorPass
	 */
	public void setProfessorPass(String professorPass) {
		this.professorPass = professorPass;
	}
}
