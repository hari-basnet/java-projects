package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here

        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

    }
}
