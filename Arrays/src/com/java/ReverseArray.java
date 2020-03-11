package com.java;

import java.util.Arrays;

public class ReverseArray {
	
	public static int[] reverseTheArray(int[] array){
		
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2; // {1,2,3,4,5} --> 2
		
		System.out.println("Given array: \n" + Arrays.toString(array));
		System.out.println("--------------sorted--------------------");
		
		for(int i = 0; i < halfLength; i++){
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
		return array;
	}
	
}
