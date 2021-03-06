package com.bean;

public class Student {

	
	private String firstName;
	private String lastName;
	private int studentId;
	
	
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param studentId
	 */
	public Student(String firstName, String lastName, int studentId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName
				+ ", studentId=" + studentId + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
}
