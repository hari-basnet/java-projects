package com.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        
//        ExampleArray exampleArray = new ExampleArray();
//
//        int[] myArray =  exampleArray.getIntegers(5);
//
//        exampleArray.printArray(myArray);
//        exampleArray.sortIntegerArrayUdemy(myArray);
//
//        System.out.println("--------------Array after sorting------------------------");
//        exampleArray.printArray(myArray);
    
//        MinimumElementChallenge mnc = new MinimumElementChallenge();
//        
//        int[] xArray = mnc.readIntegers(5);
//        int minNumber = mnc.findMin(xArray);
//    
//        System.out.println(minNumber);
        
        int[] arrayToReverse = {74, 5, 85, 12, 58, 36, 14};
        
        ReverseArray rv = new ReverseArray();
        System.out.println(Arrays.toString(rv.reverseTheArray(arrayToReverse)));
    }
}
