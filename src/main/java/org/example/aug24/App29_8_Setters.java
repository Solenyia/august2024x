package org.example.aug24;

import org.example.model.Frog;

public class App29_8_Setters {
    public static void main(String[] args) {
        Frog f1 = new Frog();

        //f1.name = "Josh";
        //f1.age = 2;

        f1.setName("jack");
        f1.setAge(12);

        System.out.println(f1.getName());
    }
}
