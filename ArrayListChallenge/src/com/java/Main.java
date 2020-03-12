package com.java;

import java.util.Scanner;

public class Main {
    
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0421589652");

    public static void main(String[] args) {
	// write your code here
        
        boolean quit = false;
        startPhone();
        printActions();
        
        while(!quit){
            
        }
    }
    
    private static void startPhone() {
        System.out.println("Starting phone...");
    }
    
    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 -to shutdown\n" +
                            "1 -to print contacts\n" +
            );
        
    }
}
