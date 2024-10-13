package org.example.model;

import org.example.Info;


public class Machine3 implements Info {

    private int id = 7;

    public void start(){
        System.out.println("Machine 3 started");
    }

    public void showInfo() {
        System.out.println("Machine id is" + id);
    }
}
