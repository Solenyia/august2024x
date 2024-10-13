package org.example.World;

public class Plant {
    // zle napisane (public)
    public String name;

    // akceptovatelne (je to final)
    public final static int ID = 8;

    private String type;

    // pomocou protected bude moct child pouzivat premenne parenta
    protected String size;

    int height;

    public Plant() {
        name = "Fred";
        // iste ako s this
        this.type = "Plant";
        this.size = "Small";
        this.height = 1;
    }

}
