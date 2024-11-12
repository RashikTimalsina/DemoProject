package com.rashiktimalsina.OOPs.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player=new Player("Rashik",60,"Sword");
        System.out.println("Initial health is : " + player.getHealth());        //here get method is used as fields cannot be accessed  as set to private

    }
}
