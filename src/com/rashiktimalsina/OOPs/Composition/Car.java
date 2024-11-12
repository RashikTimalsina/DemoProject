package com.rashiktimalsina.OOPs.Composition;

public class Car extends Vehicle {

    private int doors;
    private int engineCapacity;

    public Car(String vehicle_name, int doors, int engineCapacity) {
        super(vehicle_name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
