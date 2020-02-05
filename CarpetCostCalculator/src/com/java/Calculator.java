package com.java;

public class Calculator {
	
	private Floor floor;
	private Carpet carpet;
	
	public Calculator(final Floor floor, final Carpet carpet) {
		this.floor = floor;
		this.carpet = carpet;
	}
	
	public double getTotalCost(){
		return floor.getArea() * carpet.getCost();
	}
}
