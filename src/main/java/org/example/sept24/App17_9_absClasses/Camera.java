package org.example.sept24.App17_9_absClasses;

public class Camera extends Machine{

    @Override
    public void start() {
        System.out.println("Starting Camera");
    }

    @Override
    public void doStuff() {
        System.out.println("Doing stuff");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Camera");
    }
}
