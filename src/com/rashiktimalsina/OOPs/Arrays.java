package com.rashiktimalsina.OOPs;

import java.util.Scanner;

public class Arrays {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(10);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " +i + " typed value was " + myIntegers[i]);
        }
        System.out.println("The average is : " +getAverage(myIntegers));

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " numbers.\r");
        int[] arr = new int[number];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static double getAverage(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return (double) sum / (double)arr.length;
    }
}

