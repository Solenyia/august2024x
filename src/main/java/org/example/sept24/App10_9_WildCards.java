package org.example.sept24;

import java.util.ArrayList;

class Machineman {

    public String toString() {
        return "I am a machineMan";
    }

    public void start() {
        System.out.println("I am starting - machineman");
    }
}

class Cameraman extends Machineman {

    public String toString() {
        return "I am a CamenraMna";
    }

    public void snap() {
        System.out.println("Taking a photo");
    }
}

public class App10_9_WildCards {
    public static void main(String[] args) {

        ArrayList<Machineman> list1 = new ArrayList<Machineman>();

        list1.add(new Machineman());
        list1.add(new Machineman());

        showList(list1);

        ArrayList<Cameraman> list2 = new ArrayList<Cameraman>();

        list2.add(new Cameraman());
        list2.add(new Cameraman());

        showList(list2);
        showList(list1);
    }

    public static void showList(ArrayList<? super Cameraman> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
}
