package org.example.model;

import org.example.Info;

public class Person2 implements Info {

    private String firstName;

    public Person2(String firstName) {
        this.firstName = firstName;
    }

    public void greet(){
        System.out.println("Hello There");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is " + firstName);
    }
}
