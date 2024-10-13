package org.example.model;

public class Machine {

    private String name;
    private int code;

    public Machine() {

        this("Arnie", 5);
        System.out.println("Machine created");
    }

    public Machine(String name) {
        this(name, 5);

        System.out.println(name + " created");
        this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println(name + " created" + " ID code: " + code);
        this.name = name;
        this.code = 4;
    }

}
