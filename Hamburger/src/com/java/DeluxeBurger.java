package com.java;

public class DeluxeBurger extends Hamburger{
	
	public DeluxeBurger() {
		super("DeluxeBurger", "Saussage and Bacon", 9.99, "Rye bread");
		super.addHamburgerAddition1("Chips", 2.50);
		super.addHamburgerAddition2("Drink", 2.50);
	}
	
	@Override
	public void addHamburgerAddition1(final String name, final double price) {
		System.out.println("Cannot add more items to Deluxe burger");
	}
	
	@Override
	public void addHamburgerAddition2(final String name, final double price) {
		System.out.println("Cannot add more items to Deluxe burger");
	}
	
	@Override
	public void addHamburgerAddition3(final String name, final double price) {
		System.out.println("Cannot add more items to Deluxe burger");
	}
	
	@Override
	public void addHamburgerAddition4(final String name, final double price) {
		System.out.println("Cannot add more items to Deluxe burger");
	}
}
