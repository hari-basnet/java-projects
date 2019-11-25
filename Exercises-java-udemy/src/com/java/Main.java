package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MegaBytesConverter convert = new MegaBytesConverter();
        convert.printMegaBytesAndKiloBytes(2500);

        //
        BarkingDog dd = new BarkingDog();
        dd.shouldWakeUp(false, 5);

        //
        LeapYearCalculator cc = new LeapYearCalculator();
        boolean result = cc.isLeapYear(1990);
        boolean result2 = cc.isLeapYear2(1990);
        System.out.println(result);
        System.out.println(result2);

    }
}
