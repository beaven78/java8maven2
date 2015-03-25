package com.supplier;

/**
 * Created by St on 24/03/2015.
 */
public class Car extends Vehicle {

    public static Car doNothing(){return new Car();};

    @Override
    public void drive(){
        System.out.println("Driving car...");
    }
}
