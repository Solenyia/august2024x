package org.example.sept24;

class Pocitac {

    public static final int ID = 7;
    private String name;

    public String getData() {
        String data = "Stuff" + calcGrowthForecast();

        return data;
    }

    private int calcGrowthForecast() {
        return 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class App8_9_Encaps {
    public static void main(String[] args) {

    }
}
