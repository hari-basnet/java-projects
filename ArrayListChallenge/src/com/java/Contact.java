package com.java;

public class Contact {
	
	private String name;
	private String phoneNumber;
	
	public Contact(final String name, final String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public static Contact createContact(String name, String phoneNumber){
		return new Contact(name, phoneNumber);
	}
}
