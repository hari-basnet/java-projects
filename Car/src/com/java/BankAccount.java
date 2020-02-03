package com.java;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
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
