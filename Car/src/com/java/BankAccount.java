package com.java;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {
        this("56984", 0.00, "Default name", "Default email", "Default phone number");
        System.out.println("Empty constructor created");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("Constructors with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    // overriding constructor and the calling main constructor
    // good programming approach
    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("66647", 0.00, customerName, customerEmail, customerPhoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void depositFunds(double depositAmount) {
        this.balance = this.balance + depositAmount;
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("cant withdraw, insufficient funds");
        } else {
            this.balance = this.balance - withdrawalAmount;
            System.out.println("Amount withdrawn: " + withdrawalAmount + " \nNew balance " + this.balance);
        }
    }
}
