package com.java;

import java.util.Comparator;

public class SortByRoll implements Comparator<Student> {

	// used for sorting in ascending order of
	// roll number

	public int compare( Student a, Student b){
		return a.rollNo - b.rollNo;
	}

}
