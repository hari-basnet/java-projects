package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Clock clock = new Clock();
        
        while(true){
            System.out.println(clock);
            clock.advance();
        }
    }
}
