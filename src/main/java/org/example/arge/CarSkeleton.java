package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CarSkeleton() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println("Motor is just started");
    }
    public void drive() {
        runEngine();
    }
    protected void runEngine() {
        System.out.println("Motor is running");
    }
}
//CarSkeleton sınıfının 3 tane de subclass değeri tanımlanmalı. GasPoweredCar, ElectricCar, HybridCar

