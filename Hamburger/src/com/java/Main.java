package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        Hamburger hamburger = new Hamburger("Basic", "Beef", 5.99, "White");
        double price =  hamburger.createHamburger();

        hamburger.addHamburgerAddition1("Lettuce", 0.50);
        hamburger.addHamburgerAddition2("Tomato", 0.50);
        hamburger.addHamburgerAddition3("Cheese", 0.50);
        hamburger.addHamburgerAddition4("Mayonnaise", 0.50);

        price = hamburger.createHamburger();

        System.out.println("Total price = " + price);
        
        
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthyAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 2.55);
        System.out.println("Total healthy burger price is " + healthyBurger.createHamburger());
        
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.createHamburger();

    }
}
