package com.java;

import java.util.ArrayList;

public class MobilePhone {
	
	private String myNumber;
	private ArrayList<Contact> myContacts;
	
	public MobilePhone(final String number) {
		this.myNumber = number;
		this.myContacts = new ArrayList<>();
	}
	
	public boolean addNewContact(Contact contact){
		if(findContact(contact.getName()) >= 0){
			System.out.println("Contact is already on file");
			return false;
		}
		
		myContacts.add(contact);
		return true;
	}
	
	public boolean updateContact(Contact oldContact, Contact newContact){
		int foundPosition = findContact(oldContact);
		if(foundPosition < 0){
			System.out.println(oldContact.getName() + ", was not found.");
			return false;
		} else if(findContact(newContact.getName()) != -1){
			System.out.println("Contact with name " + newContact.getName() + " already exists. Update was not successful.");
			return false;
		}
		
		this.myContacts.set(foundPosition, newContact);
		System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
		return true;
	}
	
	public boolean removeContact(Contact contact){
		
		int foundPosition = findContact(contact);
		if(foundPosition < 0){
			System.out.println(contact.getName() + ", was not found");
			return false;
		}
		
		this.myContacts.remove(foundPosition);
		System.out.println(contact.getName() + ", has been removed.");
		return true;
	}
	
	/**
	 * @param contact contact object to search for 
	 * @return returns the first occurrence ot the object found in the ArrayList or -1 if not found
	 */
	private int findContact(Contact contact){
		return this.myContacts.indexOf(contact);
	}
	
	/**
	 * @param contactName name of the contact to search for 
	 * @return returns the index of the first occurrence of the name or returns -1 if not found 
	 */
	private int findContact(String contactName){
		for(int i = 0; i < myContacts.size(); i++){
			Contact contact = this.myContacts.get(i);
			if(contact.getName().equals(contactName)){
				return i;
			}
		}
		return -1;
	}
	
	public String queryContact(Contact contact){
		if(findContact(contact) >= 0){
			return contact.getName();
		}
		return null;
	}
	
	public Contact queryContact(String name){
		int position = findContact(name);
		if(position >= 0){
			return this.myContacts.get(position);
		}
		return null;
	}
	
	public void printContacts() {
		System.out.println("Contact list");
		
		for(int i = 0; i < myContacts.size(); i++){
			System.out.println((i +1) + ". " + myContacts.get(i).getName() + " --> " + myContacts.get(i).getPhoneNumber());
		}
	}
}
