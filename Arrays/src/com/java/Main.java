package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
//        ExampleArray exampleArray = new ExampleArray();
//
//        int[] myArray =  exampleArray.getIntegers(5);
//        
//        exampleArray.printArray(myArray);
//        exampleArray.sortIntegerArrayUdemy(myArray);
//    
//        System.out.println("--------------Array after sorting------------------------");
//        exampleArray.printArray(myArray);
    
        MinimumElementChallenge mnc = new MinimumElementChallenge();
        
        int[] xArray = mnc.readIntegers(5);
        int minNumber = mnc.findMin(xArray);
    
        System.out.println(minNumber);
        
    }
}
