package org.example.model;

public class Car extends Machine2 {
    //Car bude mat tie iste vlatnosti ako Machine2

    /*public void start(){
        System.out.println("Car started");
    }*/
    // V pripade ze zavolam car.start metodu a v Machine2 je tiez .start v Car bude mat prioritu

    public void wipeWindShield(){
        System.out.println("Wiping wind shield");
    }

    public void showInfo(){
        System.out.println("Car Info" + name);
    }
}
