package com.java;

import java.util.Scanner;

public class Main {
    
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0421589652");

    public static void main(String[] args) {
	// write your code here
        
        boolean quit = false;
        startPhone();
        printActions();
        
        while(!quit){
            System.out.println("\nEnter action: 6 to show available actions");
            int action = scanner.nextInt();
            scanner.nextLine();
            
            switch (action){
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
    
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
                default: 
                    break;
            }
        }
    }
    
    private static void startPhone() {
        System.out.println("Starting phone...");
    }
    
    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 -to shutdown");
        System.out.println("1 -to print contacts");
        System.out.println("2 -to add a new contact" );
        System.out.println("3 -to update an existing contact" );
        System.out.println("4 -to remove an existing contact");
        System.out.println("5 -to query if an existing contact exists");
        System.out.println("6 -to print a list of available actions");
        System.out.println("Choose yur action: ");
    }
    
    private static void addNewContact(){
        System.out.println("Enter new contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter the new phone number for the contact");
        String phoneNumber = scanner.nextLine();
        Contact contact = Contact.createContact(name, phoneNumber);
        if(mobilePhone.addNewContact(contact)){
            System.out.println("New contact added: name = " + name + ", phone = "+ phoneNumber);
        }else{
            System.out.println("Cannot add, " + name + " already exists on the file.");
        }
    }
    
    private static void updateContact(){
        System.out.println("Enter existing contact name to update: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }
    
        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number");
        String newPhoneNumber = scanner.nextLine();
        
        Contact newContact = Contact.createContact(newName, newPhoneNumber);
        if(mobilePhone.updateContact(existingContact, newContact)){
            System.out.println("successfully updated record");
        }else{
            System.out.println("Error updating record.");
        }
    }
    
    private static void removeContact(){
        System.out.println("Enter existing contact name to remove: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        
        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting contact");
        }
    }
    
    private static void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }
    
        System.out.println("Name: " + existingContact.getName() + " PhoneNumber: " + existingContact.getPhoneNumber());
    }
    
    
    
    
}
