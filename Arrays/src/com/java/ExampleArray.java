package com.java;

import java.util.Scanner;

public class ExampleArray {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static int[] getIntegers(int number){
		
		System.out.println("Enter " + number + " integer values.\r");
		
		int[] values = new int[number];
		
		for(int i = 0; i < values.length; i++ ){
			values[i] = scanner.nextInt();
		}
		
		return values;
	}
	
	public static double getAverage(int[] array){
		int sum = 0;
		
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		
		return (double) sum / (double)array.length;
	}
	
	public static void printAverage(int[] array){
		
		System.out.println("The average is " + getAverage(array));
	}
	
	public static void printArray(int[] array){
		
		for(int i = 0; i < array.length; i++){
		System.out.println("Element " + i + ", typed value was " + array[i]);
		}
	}
	
//	public static void sortArray(int[] array){
//		
//		int temp;
//		for (int i = 1; i < array.length; i++) {
//			for (int j = i; j > 0; j--) {
//				if (array[j] > array [j - 1]) {
//					temp = array[j];
//					array[j] = array[j - 1];
//					array[j - 1] = temp;
//				}
//			}
//		}
//	}
	
	public static int[] sortIntegerArrayUdemy(int[] array){
		
		boolean flag = true;
		int temp;
		while(flag){
			flag = false;
			for(int i = 0; i < array.length - 1; i++){
				if(array[i] < array[i + 1]){
					temp = array[i];
					array[i] = array[i + 1];
					array[i +1] = temp;
					flag = true;
				}
			}
		}
		return array;
		
	}
}
