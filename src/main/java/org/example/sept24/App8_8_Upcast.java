package org.example.sept24;

class Machina {
    public void start(){
        System.out.println("Machina is running");
    }
}

class Camera extends Machina {
    public void start(){
        System.out.println("Camera is running");
    }

    public void snap(){
        System.out.println("Photo done");
    }
}

public class App8_8_Upcast {
    public static void main(String[] args) {

        Machina m = new Machina();
        Camera c = new Camera();

        m.start();
        c.start();
        c.snap();

        // Upcasting - isli sme hore hierarchiou (z kamery na machine)
        Machina m2 = c;
        m2.start();
        // error : m2.snap();

        // Downcasting
        Machina m3 = new Camera();
        Camera c2 = (Camera)m3;
        c2.start();
        c2.snap();

        // Doesnt work --- runtime error.
        Machina m4 = new Machina();
        //Camera c4 = (Camera)m4;
        //c4.start();
    }
}
