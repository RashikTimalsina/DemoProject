package com.rashiktimalsina.OOPs.Inheritance;

public class Cat extends Animal {

    private int eyes;
    private int teeth;
    private int legs;
    private String color;

    public Cat(String name, int age, int weight, double height, String type, int eyes, int teeth, int legs, String color) {
        super(name, 5, 15, 1.7, type);
        this.eyes = eyes;
        this.teeth = teeth;
        this.legs = legs;
        this.color = color;

    }

    public void sound(){
        System.out.println("Meow");
    }

    public void run(){
        System.out.println("Gwak Gwak");
    }



    @Override
    public void eat() {
        System.out.println("Cat.eat() is called");
        sound();
        super.eat();


    }

    @Override
    public void move() {
        System.out.println("Cat.move() is called");
        run();
        super.move();
    }
}
