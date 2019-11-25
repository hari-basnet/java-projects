package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();

        // feet and inches
        FeetAndInchesToCentimeter ft = new FeetAndInchesToCentimeter();
        ft.calcFeetAndInchesToCentimeters(10,0);
        ft.calcFeetAndInchesToCentimeters(10);

        ///

        Printer myp = new Printer();
        String result = myp.printerError("aaaaakkkoaaaa");
        System.out.println(result);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

}
