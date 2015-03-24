package com.supplier;

import org.junit.Test;

import java.util.function.Supplier;

/**
 * Using Built in Lambda Types
 * Develop code that uses Supplier interface
 */
public class SupplierInterface {

    static void driveVehicle(Supplier<? extends Vehicle> supplier){

        Vehicle vehicle = supplier.get();
        vehicle.drive();
    }


    @Test
    public void test(){
        //Supplier<T>
        //get()

        //Using Lambda expression
        driveVehicle(()-> new Vehicle());
        driveVehicle(()-> new Car());

        //Using method expression
        driveVehicle(Vehicle::new);
        driveVehicle(Car::new);
    }
}
