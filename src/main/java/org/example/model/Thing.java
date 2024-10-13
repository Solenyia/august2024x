package org.example.model;

public class Thing {
    public final static int LUCKY_NUMBER = 88;
    //LUCKY_NUMBER sa nebude dat prepisat nakolko je final static (napr. ako Math.PI)

    public String name;
    public static String description;

    public static int count = 0;

    public int id = 0;

    public Thing() {

        id = count;

        count++;
    }

    public void showName() {

        System.out.println("object id: " + id + ", " + description + ": " + name);
    }

    public static void showInfo() {
        System.out.println(description);
        // nebude fungovat pretoze static showInfo je vytvorene pred nim
        // System.out.println(name);
    }
}
