package com.java;

public class Fish extends Animal{
	
	private int gills;
	private int eyes;
	private int finns;
	
	public Fish(final String name, final int size, final int weight, final int gills,
		final int eyes,
		final int finns) {
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.finns = finns;
	}
	
	private void rest(){
	
	}
	
	private void moveMuscles(){
	
	}
	
	private void moveBackFin(){
	
	}
	
	private void swim(int speed){
		moveMuscles();
		moveBackFin();
		super.move(speed);
	}
}
