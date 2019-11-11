package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 8000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score: " + highScore);

        score = 8000;
        levelCompleted = 5;
        bonus = 100;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score: " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Koray", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Hari", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Simon", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Cherry", highScorePosition);

        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Cherry", highScorePosition);

        highScorePosition = calculateHighScorePosition(449);
        displayHighScorePosition("Cherry", highScorePosition);


    }

    // create a method called displayHighScorePosition
    public static void displayHighScorePosition(String playerName, int position) {
        System.out.printf("%s managed to get into position %d on the high score table.\n", playerName, position);
    }

    public static int calculateHighScorePosition(int score) {

        /*if(score >= 1000){
            return 1;
        }else if (score >= 500){
            return 2;
        }else if (score >= 100){
            return 3;
        }else {
            return 4;
        }*/

        int position = 4; // assuming position 4 will be returned

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }
}
