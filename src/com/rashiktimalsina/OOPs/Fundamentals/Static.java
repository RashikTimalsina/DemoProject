package com.rashiktimalsina.OOPs.Fundamentals;

class Calculator{
    public static void printSum(int x, int y, int z) {
        System.out.println("Sum " + x + " " + y + " " + z);
    }
}


//Main class
public class Static {
    public static void main(String[] args) {
        Calculator.printSum(1, 2, 3);       //call the static method from the another classs
        Static.printNum();   //calling  method from the same main class i.e named Static
    }

    public static void printNum(){
        System.out.println("Hello Statics");
    }

}
