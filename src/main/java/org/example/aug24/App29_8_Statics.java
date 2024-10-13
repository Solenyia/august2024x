package org.example.aug24;

import org.example.model.Thing;

public class App29_8_Statics {
    public static void main(String[] args) {
        Thing.description = "I am a thing";

        Thing.showInfo();

        System.out.println("na zaciatku tvorenia je count: " + Thing.count);

        Thing t1 = new Thing();
        Thing t2 = new Thing();

        System.out.println("po vytvoreni objektov je count: " + Thing.count);

        t1.name = "Rock";
        t2.name = "Soup";

        t1.showName();
        t2.showName();

        System.out.println(Math.PI);

        System.out.println(Thing.LUCKY_NUMBER);
    }
}
