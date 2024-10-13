package org.example.sept24;

import java.util.ArrayList;
import java.util.HashMap;

class Animal{

}

public class App9_9_Generics {
    public static void main(String[] args) {

        ////////////////// Before Java 5

        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("pineapple");

        String fruit = (String)list.get(1);

        System.out.println(fruit);

        /////////////// Modern Style

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("parrot");
        strings.add("shark");

        String animals = strings.get(1);

        System.out.println(animals);

        /////////////// There can be more than one type argument //////////////////

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        ////////////// Java 7 Style ///////////////////////////////////

        ArrayList<Animal> someList = new ArrayList<Animal>();

    }
}
