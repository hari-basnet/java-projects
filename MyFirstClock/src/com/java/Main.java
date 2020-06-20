package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ClockHand hour = new ClockHand(24);
        ClockHand minute = new ClockHand(60);
        ClockHand seconds = new ClockHand(60);
        
        while(true){
            System.out.println(hour + ":" + minute + ":" + seconds);
            
            seconds.advance();
            if(seconds.getValue() == 60){
                minute.advance();
                
                if(minute.getValue() == 60){
                    hour.advance();
                }
            }
        }
    }
}
