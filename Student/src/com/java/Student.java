package com.java;

public class Student {

	int rollNo;
	String name;
	String address;

	// constructor
	public Student(int rollNo, String name, String address){

		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	// used to print student details in main

	public String toString(){
		return this.rollNo + " " + this.name + " " + this.address;
	}
}
