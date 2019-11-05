package com.ByteShortLongInt;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println(" Integer maximum value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // this way is problematic as java cannot
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // detect this

        System.out.println(myValue);

        int maxIntTest = 2_147_483_647;

        int myMinByteValue = Byte.MIN_VALUE;
        int myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte maximum value = " + myMaxByteValue);

        int myMinShortValue = Short.MIN_VALUE;
        int myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short maximum value = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("long Minimum Value = " + myMinLongValue);
        System.out.println("long maximum value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_787L;

        // type casting

        int myTotal = (myMinIntValue / 2);

        byte nyNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short)(myMinShortValue / 2);

        // challenge
        short shortChallengeNumber = (short) 10;

        byte byteChallengeNumber = (byte) 20;

        int intChallengeNumber = 50;

        long longChallengeNumber = (50000L + 10L * (shortChallengeNumber + byteChallengeNumber + intChallengeNumber));

        System.out.println("total of challenge: " + longChallengeNumber);


    }
}
