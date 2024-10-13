package org.example;

import org.example.World.Plant;

public class Grass extends Plant{
    public Grass() {

        //Wont work, Grass not in same package as Plant
        //System.out.println(this.height);
    }
}
