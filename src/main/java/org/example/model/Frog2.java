package org.example.model;

public class Frog2 {

    private int ID;
    private String Name;

    public Frog2(int ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }

    public String toString() {

        return  String.format("%4d: %s", ID, Name);

        /*StringBuilder sb = new StringBuilder();
        sb      .append(ID)
                .append(": ")
                .append(Name);
        return sb.toString();*/
    }
}
