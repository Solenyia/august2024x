package org.example.model;

public class Frog {
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setInfo(String name, int age){
        setName(name);
        setAge(age);
    }

}
