package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double doubleVariable = 20.00d;
        double secondDouble = 80.00d;

        double total = doubleVariable + secondDouble * 100d;
        System.out.println(total);


        double remainder = total % 40.00d;

        System.out.println(remainder);

        boolean isRemainderZero = remainder == 0 ? true : false;

        System.out.println(isRemainderZero);

        if(!isRemainderZero){
            System.out.println("Got some remainder");
        }


    }
}
