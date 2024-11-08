package com.rashiktimalsina;

import java.sql.SQLOutput;

public class Assignment {
    public static void main(String[] args) {

        int highScorePosition=calculateHighScorePosition(1500);
        displayHighScorePosition("Rashik", highScorePosition);

        highScorePosition=calculateHighScorePosition(900);
        displayHighScorePosition("Ram", highScorePosition);


         highScorePosition=calculateHighScorePosition(400);
        displayHighScorePosition("Raj", highScorePosition);


         highScorePosition=calculateHighScorePosition(50);
        displayHighScorePosition("Rashik", highScorePosition);
    }

    public static void displayHighScorePosition(String pl_name, int highScorePosition) {
        System.out.println(pl_name + " managed to get into position "
                + highScorePosition + " on the high score table ");

    }

    public static int calculateHighScorePosition(int pl_score){

        if(pl_score > 1000){
            return 1;
        }
        else if(pl_score > 500 && pl_score < 1000){
            return 2;
        }
        else if(pl_score > 100 && pl_score < 500){
            return 3;
        }
        else{
            return 4;
        }
    }

}
