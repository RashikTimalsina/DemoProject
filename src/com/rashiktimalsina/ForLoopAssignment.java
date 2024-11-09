package com.rashiktimalsina;
//Using for loop
public class ForLoopAssignment {
    public static void main(String[] args) {
        for(int i=2; i<9; i++){
            System.out.println(String.format("%.2f",calculateInterest(10000,i)));        //String format fixes number of zero
        }

        System.out.println("**********");

        for(int i=9; i>2; i--){
            System.out.println(String.format("%.2f",calculateInterest(10000,i)));        //String format fixes number of zero
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));            //10000*2/100 (interestRate must be in double dt// )

    }
}
