package com.java;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car tesla = new Car();
        Car toyota = new Car();

        tesla.setModel("Model S");

        toyota.setModel("Prius");

        System.out.println("Model is : " + tesla.getModel());
        System.out.println("Model is : " + toyota.getModel());

        //// account balance

        BankAccount harisAccount = new BankAccount();

        harisAccount.depositFunds(100000);
        harisAccount.withdrawFunds(500);

        System.out.println("haris account balance is: " + harisAccount.getBalance());
    }
}
