package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;  // casting
        double myDoubleValue = 5d / 3d;  // double is more precise

        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        double kilograms = 50d;
        double pounds = kilograms * 2.20462d;

        System.out.println("total pounds: " + pounds);


        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

        /**
         *         char and boolean
         */

        char myChar = 'd';
        char myUnicodeChar = '\u0064';

        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        String numberString = "12";

        /**
         * string cannot be changed into int
         */






    }
}
