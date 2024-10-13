package org.example.World;

public class Chair extends Furniture {
    @Override
    public void grow() {
        System.out.println("Chair growing");
    }

    public void rot(){
        System.out.println("Chair rot");
    }
}
