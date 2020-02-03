package com.java;

public class SimpleCalculator {
    // write your code here
    private double firstNumber;
    private double secondNumber;


    public void setFirstNumber(double number) {
        this.firstNumber = number;
    }

    public void setSecondNumber(double number) {
        this.secondNumber = number;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return secondNumber * firstNumber;
    }

    public double getDivisionResult() {

        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }


}
