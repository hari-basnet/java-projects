package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String myString = "this is a string";

        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";

        numberString = numberString + "49.95";

        System.out.println(numberString);
        int myInt = 50;
        String lastString = "10";
        lastString = lastString + myInt;

        System.out.println(lastString);

        double doubleNumber = 120.47d;

        lastString = lastString + doubleNumber;

        System.out.println(lastString);

        int result = 1 + 2; // 1 +2 = 3

        System.out.println(result);

        int prevousResult = result;

        System.out.println(prevousResult);

        result = result -1;

        System.out.println(result);





    }
}
