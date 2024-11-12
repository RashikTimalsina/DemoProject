package com.rashiktimalsina.OOPs.Inheritance;

//Parent Class
public class Animal {

    private String animal_name;
    private int animal_age;
    private int animal_weight;
    private double animal_height;
    private String animal_type;

    public Animal(String name, int age, int weight , double height, String type) {
        this.animal_name = name;
        this.animal_age = age;
        this.animal_weight = weight;
        this.animal_height = height;
        this.animal_type = type;

    }

    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(){
        System.out.println("Animal.move() called");
    }

    public String getAnimal_name() {
        return animal_name;
    }

    public int getAnimal_age() {
        return animal_age;
    }

    public int getAnimal_weight() {
        return animal_weight;
    }

    public double getAnimal_height() {
        return animal_height;
    }

    public String getAnimal_type() {
        return animal_type;
    }
}
