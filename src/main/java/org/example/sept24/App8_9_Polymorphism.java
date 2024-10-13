package org.example.sept24;

import org.example.World.Furniture;
import org.example.World.Chair;


public class App8_9_Polymorphism {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        Chair chair = new Chair();


        Furniture furniture2 = chair;
        // furniture2 is pointing at chair
        furniture2.grow();

        chair.rot();

        //furniture2.rot();

        doGrow(chair);

    }

    public static void doGrow(Furniture furniture) {
        furniture.grow();
    }

}
