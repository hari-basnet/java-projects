package com.java;

public class ReverseArray {
	
	public static int[] reverseTheArray(int[] array){
		
		int temp = 0;
		
		for(int i = 0; i < array.length / 2; i++){
			if(array[i] > array[i + 1]){
				temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
		return array;
	}
	
}
