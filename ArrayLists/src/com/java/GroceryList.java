package com.java;

import java.util.ArrayList;

public class GroceryList {
	
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addItem(String item){
		groceryList.add(item);
	}
	
	public void printGroceryItem(){
		System.out.println("You have " + groceryList.size() + " items in your grocery list");
		
		for(int i = 0; i < groceryList.size(); i++){
			System.out.println((i + 1 ) + ". " + groceryList.get(i));
		}
	}
	
	public void modifyGroceryItem(int position, String newItem){
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position + 1) + " has been modified.");
	}
	
	
	public void deleteItem(int position){
		String item = groceryList.get(position);
		
		System.out.println("Item \"" + item + "\" has been removed from the list.");
		groceryList.remove(position);
	}
	
	public String findItem(String searchItem){
//		boolean exists = groceryList.contains(searchItem);
		int position = groceryList.indexOf(searchItem);
		if(position >= 0){
			return groceryList.get(position);
		}
		return "Not found";
	}
	
	public static void main(String[] args) {
		// write your code here
		
		GroceryList gl = new GroceryList();
		
		gl.addItem("Kauli");
		gl.addItem("Banda");
		gl.addItem("Bhyanta");
		gl.addItem("Paneer");
		gl.addItem("Chyau");
		
		gl.printGroceryItem();
		
		System.out.println("----------------------------------");
		
		gl.modifyGroceryItem(1, "Ban tarool");
		
		gl.printGroceryItem();
		
		System.out.println("-----------------------------------");
		
		gl.deleteItem(3);
		
		gl.printGroceryItem();
		
		System.out.println(gl.findItem("chyau"));
	}
	
	
}
