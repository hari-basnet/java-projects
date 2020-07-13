package com.java;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class UserInterface {
	private ArrayList<Recipe> recipes;
	private Scanner scanner;
	
	public UserInterface(Scanner scanner) {
		this.recipes = new ArrayList<>();
		this.scanner = scanner;
	}
	
	public void start(){
		String filename = "/home/habasnet/Github/java-projects/RecipeSearchDebugger/src/recipe.txt";
		
		readFile(filename);
		
		printCommands();
		
		while(true){
			System.out.println("Enter Command: ");
			String command = scanner.nextLine();
			processCommand(command);
			if(command.equals("")){
				break;
			}
		}
		
	}
	
	public void readFile(String filename) {
		try(Scanner fileScanner = new Scanner(Paths.get(filename))){
			System.out.println("Inside try");
			String name = "";
			int time = -1;
			ArrayList<String> ingredients = new ArrayList<>();
			
			while(fileScanner.hasNextLine()){
				
				if(!fileScanner.hasNextLine()){
					break;
				}
				String line = fileScanner.nextLine();
				
				if(!line.equals("")){
					for(int i = 0; fileScanner.hasNextLine(); i++){
						System.out.print(i);
						if(line.equals("")){
							break;
						}
						if(i == 0){
							name = String.valueOf(line);
							line = fileScanner.nextLine();
						}else if(i == 1){
							time = Integer.valueOf(line);
							line = fileScanner.nextLine();
						}else{
							ingredients.add(line);
							line = fileScanner.nextLine();
						}
					}
					this.recipes.add(new Recipe(name, time, ingredients));
					
				}
				
				if(line.equals("")){
					continue;
				}
				System.out.println(Arrays.toString(recipes.toArray()));
			}
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	
	
	private void processCommand(String command) {
		switch(command){
			case "list":
				listRecipes();
				break;
			case "stop":
				break;
			default:
				System.out.println("Unknown command!!!");
		}
	}
	
	private void listRecipes() {
		for(Recipe r : recipes){
			System.out.println(r.printRecipe());
		}
	}
		
	public static void printCommands(){
		System.out.println("Commands: ");
		System.out.println("list - lists the recipes");
		System.out.println("stop - stops the program");
		System.out.println("find name - searches recipes by name");
		System.out.println("find cooking time - searches recipes by cooking time");
		System.out.println("find ingredient - searches recipes by ingredient");
	}
	
}

