package org.example.model;

public class Robot {
    public void speak(String text)
    {
        System.out.println(text);
    }

    public void jump(int height){
        System.out.println("Jumping " + height);
    }

    public void move(String direction, double distance){
        System.out.println("Moving " + direction + " at " + distance + " meters");
    }
}
