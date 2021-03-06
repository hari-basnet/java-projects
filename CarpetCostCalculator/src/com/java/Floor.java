package com.java;

public class Floor {
	
	private double width;
	private double length;
	
	public Floor(final double width, final double length) {
		if(width < 0){
			this.width = 0;
		}else{
			this.width = width;
		}
		
		if(length < 0){
			this.length = 0;
		}else {
			this.length = length;
		}
	}
	
	public double getArea(){
		return width * length;
	}
}
