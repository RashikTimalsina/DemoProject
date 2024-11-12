package com.rashiktimalsina.OOPs.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat" ,2, 7, 1.7 ,"Meow");

        Cat cat =new Cat("Dora", 2, 8, 1.5, "Classic", 2, 14, 2, "white");
        cat.eat();
        cat.move();
    }
}
