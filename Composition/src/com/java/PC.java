package com.java;

public class PC {
	
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	public PC(final Case theCase, final Monitor monitor, final Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	public Case getTheCase() {
		return theCase;
	}
	
	public Monitor getMonitor() {
		return monitor;
	}
	
	public Motherboard getMotherboard() {
		return motherboard;
	}
}
