package com.hcl.java.StudentCousrse;

public class Student {
	
	private int id;
	private String studentName;
	private Course course;
	
	private int marks;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", course=" + course + ", marks=" + marks + "]";
	}
	public Student(int id, String studentName, Course course, int marks) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.course = course;
		this.marks = marks;
	}
	
	
	
	
	

}
