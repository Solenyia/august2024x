package org.example.sept24;

import org.example.model.Car;
import org.example.model.Machine2;

public class App2_9_Inheritance {
    public static void main(String[] args) {
        Machine2 m = new Machine2();

        m.start();
        m.stop();

        Car car1 = new Car();
        //Car bude mat tie iste vlastnosti ako Machine2

        car1.start();
        car1.wipeWindShield();
        car1.showInfo();
        car1.stop();
    }
}
