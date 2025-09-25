package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public void startEngine() {
        System.out.println("the ford's engine is starting");
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public void accelerate() {
        System.out.println("the ford is accelerating");
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public void brake() {
        System.out.println("the ford is braking");
        System.out.println(getClass().getSimpleName());
    }
}
