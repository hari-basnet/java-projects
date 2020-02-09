package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        
        System.out.println("The cost of carpeting the floor is " + calculator.getTotalCost());
        
        
        // complex number
        ComplexNumber cn = new ComplexNumber(1,-1);
        cn.add(1,1);
    }
}
