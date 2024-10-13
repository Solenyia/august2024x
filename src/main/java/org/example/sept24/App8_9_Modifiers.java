package org.example.sept24;

import org.example.World.Plant;

/*
 * private --- only within same calss
 * public --- from anywhere
 * protected --- sublass, same package
 * no modifier --- package only
 */

public class App8_9_Modifiers {
    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println(plant.name);

        System.out.println(plant.ID);

        // size je protected App nie je v tom istom package ako Plant
        // System.out.println(plant.size);

        // App and Plant in different package, height has package visibility
        //System.out.println(plant.height);
    }
}
