package org.example.aug24;


import org.example.model.Person;

public class App27_8_Getters {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "John";
        p1.age = 18;

        //p1.speak();

        int years = p1.calculateYearsToRetire();

        System.out.println("zostavajuce roky " + years);

        int age = p1.getAge();
        String name = p1.getName();

        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }
}
