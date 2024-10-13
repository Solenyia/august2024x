package org.example.sept24.App17_9_absClasses;

public class App {
    public static void main(String[] args) {
        Camera cam1 = new Camera();
        cam1.setId(5);

        Car car1 = new Car();
        car1.setId(4);

        car1.start();
        car1.doStuff();
        car1.stop();

    }
}
