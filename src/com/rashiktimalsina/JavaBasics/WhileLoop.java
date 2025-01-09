package com.rashiktimalsina.JavaBasics;

public class WhileLoop {
    public static void main(String[] args) {

        int count =0;
        while(count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        count=1;
        while(true){
            if(count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;

        }
    }
}
