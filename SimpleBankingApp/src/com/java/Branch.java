package com.java;

import java.util.ArrayList;

public class Branch {
	
	private String branchName;
	private ArrayList<Customer> customers;
	
	public Branch(String name){
		this.branchName = name;
		this.customers = new ArrayList<Customer>();
	}
	
	public String getBranchName() {
		return branchName;
	}
	
	public void newCustomer(String customerName, double initialAmount){
		
	}
}
