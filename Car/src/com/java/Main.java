package com.java;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car lamborghini = new Car();
        Car toyota = new Car();

        lamborghini.setModel("hiura don");

        System.out.println("Model is : " + lamborghini.getModel());

        System.out.println(lamborghini);
    }
}
