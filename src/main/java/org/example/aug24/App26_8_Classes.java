package org.example.aug24;

/*class Person {
    //Instance variables (data or "state")
    String name;
    int age;

    // Classes can contain

    // Data
    // Subroutines (methods)

    void speak(){
        for(int i = 0; i<3 ; i++)
        {
            System.out.println("My name is " + name + " and I am " + age + " years old");
        }
    }

    void sayHello(){
        System.out.println("Hello World");
    }

}*/

import org.example.model.Person;
import org.example.model.Znacka;

public class App26_8_Classes {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.name = "John";
        person1.age = 18;
        person1.speak();
        //person1.sayHello();

        Person person2 = new Person();
        //Typ  meno    = novy Person(meno classy) object
        person2.name = "Jane";
        person2.age = 22;
        person2.speak();

        Znacka znacka1 = new Znacka();

        znacka1.nazov = "Wolf";
        znacka1.rokvyroby = 1925;

        Znacka znacka2 = new Znacka();

        znacka2.nazov = "Bob";
        znacka2.rokvyroby = 1969;

    }
}
