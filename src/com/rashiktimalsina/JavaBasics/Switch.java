package com.rashiktimalsina.JavaBasics;

public class Switch {
    public static void main(String[] args) {

        int switchValue=6;
        switch (switchValue) {
            //can case the variables at once by separating by :
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("was printed 1 or 2 or 3 or 4 or 5");
                break;
            default:
                System.out.println("was error in integers ");
                break;
        }

        String word="abc";
        switch (word) {
            case "abc":
                System.out.println("was printed abc");
                break;

            case "xyz":
                System.out.println("was printed xyz");
                break;

            default:
                System.out.println("was error in word");

        }

    }
}
