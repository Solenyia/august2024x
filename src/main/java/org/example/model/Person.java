package org.example.model;

public class Person{
    public String name;
    public int age;

    public void speak(){
        System.out.println("My name is " + name);
    }

    public int calculateYearsToRetire()
    {
        int yearsLeft = 65 - age;

        return yearsLeft;
    }

    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }
}
