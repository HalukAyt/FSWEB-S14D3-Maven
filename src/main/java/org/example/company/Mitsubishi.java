package org.example.company;

public class Mitsubishi extends  Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public void startEngine() {
        System.out.println("the mitsubishi's engine is starting");
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public void accelerate() {
        System.out.println("the mitsubishi is accelerating");
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public void brake() {
        System.out.println("the mitsubishi is braking");
        System.out.println(getClass().getSimpleName());
    }

}
