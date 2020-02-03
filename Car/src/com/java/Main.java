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

        BankAccount ritasAccount = new BankAccount("12345", 0.00, "Rita Basnet", "email@email.com", "125455125");
        System.out.println(ritasAccount.getCustomerName());

        System.out.println("haris account balance is: " + harisAccount.getBalance());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getVipCustomerName());

        VipCustomer person2 = new VipCustomer("Hari Basnet", "hari@email.com");
        System.out.println(person2.getVipCustomerName());

        VipCustomer person3 = new VipCustomer("Pramesh Basnet", 5000.00, "pramesh@gmail.com");
        System.out.println(person3.getVipCustomerName());
    }
}
