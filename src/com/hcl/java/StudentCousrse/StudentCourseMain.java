package com.hcl.java.StudentCousrse;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StudentCourseMain {

	public static void main(String[] args) {
		
		List<Student> studentWithCourse=new ArrayList<>();
	
	    // 3 Question Answer	
		studentWithCourse.add(new Student(1, "Arun", new Course(1,"Microservices","18/10/2021","30/12/2021"), 200));
		studentWithCourse.add(new Student(2, "Raj", new Course(2,"Rest Api","12/10/2021","20/12/2021"), 300));
		studentWithCourse.add(new Student(3, "Roshan", new Course(3,"Spring","25/10/2021","15/12/2021"), 400));
		//studentWithCourse.add(new Student(4, "Prity", new Course(4,"Spring boot","10/10/2021","22/12/2021"), 200));

    List<Student> studentDetails=studentWithCourse.stream().filter(o->o.getCourse().getCourseId()==(1)).collect(Collectors.toList());
	studentDetails.forEach(details-> System.out.println("StuentDetails All Course >>>>>>>>>>>>>>>>>>>>"+  details));
	
	//4 Question with Answer
   OptionalDouble marksAverage=studentWithCourse.stream().filter(totalAverage->totalAverage.getCourse().getCourseId()==(1)).mapToLong(o->o.getMarks()).average();
   System.out.println("Marsks Average score>>>>>>>>>>>>>>>>"+ marksAverage);
	

    //OptionalDouble obj = students.stream().filter(totalAverage->totalAverage.getCourse().getCourseId()==(1)).mapToLong(o->o.getMarks()).average();

	//if (obj.isPresent()) {
      //  System.out.println(obj.getAsDouble());
    //}
    //else {
      //  System.out.println("-1");
  //  }

	}
	
	
}
