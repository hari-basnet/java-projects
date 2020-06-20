package com.java;

public class ClockHand {
	
	private int value;
	private int limit;
	
	public ClockHand(final int limit) {
		this.value = 0;
		this.limit = limit;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void advance(){
		// increase the value by 1
		this.value = this.value + 1;
		
		if (this.value > limit){
			this.value = 0;
		}
	}
	
	public String toString(){
		if(this.value < 10){
			return "0" + this.value;
		}
		
		return "" + this.value;
	}
}
