package com.hcl.java;

import java.util.Arrays;
import java.util.List;

public class CommaSeprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> planets = Arrays.asList("Mercury", 
                "Venus", 
                "Mars", 
                "");

String planetsCommaSeparated = String.join(",", planets);

System.out.println(planetsCommaSeparated);
	}

}
