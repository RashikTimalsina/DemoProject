package com.rashiktimalsina.JavaBasics;

//WAP to find the sum of all numbers that can be divided with both 3 and 5 using for loop with range of numbers 1 to 1000
// and break out the loop once you find 5 numbers to meet the condition

public class ForLoopAssignment2 {

    public static void main(String[] args) {

        int count=0;
        int sum=0;

        for(int i=1;i<=1000;i++){
                if((i % 3 == 0) && (i % 5 == 0)){
                    count++;
                    sum+=i;
                    System.out.println("Found number = "+i);
                }

                if(count == 5){
                    break;
                }

        }

        System.out.println("Sum = "+sum);
    }

}
