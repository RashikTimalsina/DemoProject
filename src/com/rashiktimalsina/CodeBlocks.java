package com.rashiktimalsina;

public class CodeBlocks {

    public static void main(String[] args) {

        int highScore=calculateScore(true, 5000, 5, 50);
        System.out.println("your final score is: " + highScore);

        highScore=calculateScore(true, 10000, 10, 100);
        System.out.println("your final score is: " + highScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += score;
            return finalScore;
        }
        return -1;
    }

}
