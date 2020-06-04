package com.java;

import java.util.ArrayList;

public class Bank {
	
	private String name;
	private ArrayList<Branch> branches;
	
	public Bank(final String name) {
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}
	
	public boolean addBranch(String branchName){
		if(findBranch(branchName) == null){
			this.branches.add(new Branch(branchName));
			return true;
		}
		return false;
	}
	
	public boolean addCustomer(String branchName, String customerName, double initialAmount){
		Branch branch = findBranch(branchName);
		if(branch != null){
			return branch.newCustomer(customerName, initialAmount);
		}
		
		return false;
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, double amount){
		Branch branch = findBranch(branchName);
		
		if(branch != null){
			return branch.addCustomerTransaction(customerName, amount);
		}
		
		return false;
	}
	
	private Branch findBranch(String branchName){
		
		for(int i = 0; i < branches.size(); i++){
			Branch checkedBranch = this.branches.get(i);
			if(checkedBranch.getBranchName().equals(branchName)){
				return checkedBranch;
			}
		}
		return null;
	}
	
	public boolean listCustomers(String branchName, boolean showTransaction){
		Branch branch  = findBranch(branchName);
		if(branch != null){
			System.out.println("Customer details for branch: " + branch.getBranchName());
			
			ArrayList<Customer> branchCustomers = branch.getCustomers();
			for(int i = 0; i < branchCustomers.size(); i++){
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
				if(showTransaction){
					System.out.println("Transactions");
					ArrayList<Double> customerTransactions = branchCustomer.getTransactions();
					for(int j = 0; j < customerTransactions.size(); j++){
						Double transaction = customerTransactions.get(j);
						System.out.println("[" + (j +1) + "] Amount " + transaction );
					}
				}
			}
			return true;
		}else{
			return false;
		}
			
	}
}
