package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static int[] readIntegers(int count){
		System.out.println("Enter " + count + " integer values.\r");
		int[] values = new int[count];
		for(int i = 0; i < values.length; i++ ){
			values[i] = scanner.nextInt();
		}
		return values;
	}
	
	public static int findMin(int[] array){
		
		int minItem = Integer.MAX_VALUE;
		
		for(int i = 0; i < array.length; i++){ // not -1 here because loop needs to run until last element
			int value = array[i];
			
			if(value < minItem){
				minItem = value;
			}
		}
		return minItem;
	}
	
	
}
