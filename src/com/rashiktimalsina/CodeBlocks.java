package com.rashiktimalsina;

public class CodeBlocks {

    public static void main(String[] args) {

        calculateScore(true, 5000, 5, 50);
        calculateScore(true, 10000, 7, 100);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){


//        if(score <=5000 && score >=1000){
//
//            System.out.println("your score was less or equal than 5000 and more or equal than 1000");
//        }
//        else if(score <1000){
//
//            System.out.println("your score was lesser than 1000");
//        }
//        else{
//
//            System.out.println("got here");
//
//        }

        if(gameOver){
            int finalScore=score+(levelCompleted*bonus);
            System.out.println("your final score is : " + finalScore);
        }
    }

}
