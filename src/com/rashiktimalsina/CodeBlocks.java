package com.rashiktimalsina;

public class CodeBlocks {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score=5000;
        int levelCompleted=5;
        int bonus=50;

        calculateScore();

        score=10000;
        levelCompleted=8;
        bonus=40;

        if(gameOver){
            int finalScore=score+(levelCompleted*bonus);
            System.out.println("your final score is : " + finalScore);
        }
    }


    public static void calculateScore(){
        boolean gameOver = true;
        int score=5000;
        int levelCompleted=5;
        int bonus=50;

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
