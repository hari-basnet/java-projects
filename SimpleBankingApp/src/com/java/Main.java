package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        Bank bank = new Bank("Nepal Bank");
        
        bank.addBranch("Thimi");
        
        bank.addCustomer("Thimi", "hari", 50.55);
        bank.addCustomer("Thimi", "Rupak", 50.55);
        bank.addCustomer("Thimi", "Ritesh", 50.55);
        bank.addCustomer("Thimi", "Abhiraj", 50.55);
        
        bank.addBranch("Dolakha");
        bank.addCustomer("Dolakha", "Anuradha", 100);
        
        bank.addCustomerTransaction("Thimi", "hari", 1200);
        bank.addCustomerTransaction("Thimi", "Ritesh", 5000);
        bank.addCustomerTransaction("Thimi", "Abhiraj", 4000);
        
        bank.listCustomers("Thimi", true);
        
        bank.addBranch("Thimi");
    }
}
