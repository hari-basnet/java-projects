package com.java;

public class EqualSumChecker {

    public static boolean hasEqualSum(int a, int b, int c){
        int sum = a + b;
        if(sum == c){
            return true;
        }

        return false;
    }
}
