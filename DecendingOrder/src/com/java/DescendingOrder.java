package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {

	public static int sortDesc(final int num){

		List<String> numAsList = new ArrayList<>();

		// looping through the given number and adding each number to the list
		for(int i = 0; i < String.valueOf(num).length(); i++){
			numAsList.add(i, String.valueOf(num).substring(i, i +1));
		}
		// using collection methods to reverse the order of the number
		Collections.sort(numAsList, Collections.reverseOrder());

		String numAsString = "";
		for (String digit : numAsList){
			numAsString = numAsString.concat(digit);
		}

		return Integer.parseInt(numAsString);
	}

	public static void displaySortedNumber(final int num){
		System.out.println(sortDesc(num));
	}
}
