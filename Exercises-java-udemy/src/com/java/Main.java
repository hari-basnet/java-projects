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

        //
        DecimalComparator dc = new DecimalComparator();
        System.out.println(dc.areEqualByThreeDecimalPlaces(2.555, 2.555));

        //
        EqualSumChecker checker = new EqualSumChecker();
        System.out.println(checker.hasEqualSum(4,5,7));

        //
        TeenNumberChecker teenCheckeer = new TeenNumberChecker();
        System.out.println(teenCheckeer.hasTeen(15,88,95));
        System.out.println(teenCheckeer.hasTeen(35,88,95));

    }
}
