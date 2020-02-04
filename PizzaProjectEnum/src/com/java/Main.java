package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        Pizza testPizza = new Pizza();
        testPizza.setStatus(Pizza.PizzaStatus.READY);
    
        System.out.println(testPizza.getStatus());
    }
}
