package com.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){

        BigDecimal number1 = new BigDecimal(String.valueOf(a));
        BigDecimal number2 = new BigDecimal(String.valueOf(b));

        number1 = number1.setScale(3, RoundingMode.DOWN);
        number2 = number2.setScale(3, RoundingMode.DOWN);

        int equals =  number1.compareTo(number2);

        return (equals == 0);
    }
}
