package com.rashiktimalsina;

//
//Create a method called displayHighScorePosition
//it should contain players name as a parameter , and a 2nd parameter as a position in the high score table
//        You should display the players name along with a message like "managed to get into position " and the
//        position they got and a further message on the high score table
//
//        Create a 2nd method called calculateHighScorePosition
//        it should be sent one argument only, the player score
//        should be return an int
//        the return data should be
//        1.if the score is >1000
//        2.if the score is >500 and <1000
//        3.if the score is >100 and <500
//        4. in all other cases
//        //call both methods and display the results of the following
//        // a score of 1500, 900 400 and 50

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

//        if(pl_score > 1000){
//            return 1;
//        }
//        else if(pl_score > 500){
//            return 2;
//        }
//        else if(pl_score > 100){
//            return 3;
//        }
//        else{
//            return 4;
//        }

        int postion=4;
        if(pl_score>=1000){
            postion=1;
        }
        else if(pl_score>=500){
            postion=2;
        }
        else if(pl_score>=100){
            postion=3;
        }
        return postion;
    }

}
