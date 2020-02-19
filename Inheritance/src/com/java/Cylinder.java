package com.java;

public class Cylinder extends Circle {
	
	private double height;
	
	public Cylinder(final double radius, final double height) {
		super(radius);
		if(height < 0){
			this.height = 0;
		}else{
			this.height = height;
		}
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume(){
		return getArea() * height;
	}
}
