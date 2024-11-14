package com.rashiktimalsina.OOPs.Composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions=new Dimensions(20,20, 5);
        Case theCase= new Case("220-B" , "Apple" , "240MHz" ,dimensions);

        Monitor monitor=new Monitor("Beast" ,"Dell" ,24, new Resolution(12,11));

        Motherboard motherboard=new Motherboard("A3-880","Asus", 4, 6, "v2.3");
        PC thePC=new PC(theCase,monitor,motherboard);
        thePC.getTheMonitor().drawPixelAt(15,20,"red");
        thePC.getTheMotherboard().LoadProgram("Windows 1.0.1");
        thePC.getTheCase().pressPowerButtton();
    }



}
