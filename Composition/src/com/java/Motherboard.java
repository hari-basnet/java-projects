package com.java;

public class Motherboard {
	private String model;
	private String manufacturer;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	
	public Motherboard(final String model, final String manufacturer, final int ramSlots, final int cardSlots, final String bios) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	
	public void loadProgram(String programName){
		System.out.println("Program " + programName + " is now loading...");
	}
	
	public String getModel() {
		return model;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public int getRamSlots() {
		return ramSlots;
	}
	
	public int getcardSlots() {
		return cardSlots;
	}
	
	public String getBios() {
		return bios;
	}
}
