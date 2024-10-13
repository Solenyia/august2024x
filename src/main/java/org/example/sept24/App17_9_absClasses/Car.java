package org.example.sept24.App17_9_absClasses;

public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void doStuff() {
        System.out.println("Car is doing stuff");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
}
