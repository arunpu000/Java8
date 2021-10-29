package com.hcl.java.StudentCousrse;

import java.time.LocalDate;

public class Course {
	
	private int courseId;
	private String courseName;
	private String startDate;
	private String endDate;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Course(int courseId, String courseName, String startDate, String endDate) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
