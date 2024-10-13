package org.example.sept24;

import org.example.Info;
import org.example.model.Machine3;
import org.example.model.Person2;

public class App3_9_Interfaces {
    public static void main(String[] args) {

        Machine3 mach1 = new Machine3();
        mach1.start();

        Person2 person1 = new Person2("John");
        person1.greet();

        Info info1 = new Machine3();
        info1.showInfo();

        Info info2 = person1;
        info2.showInfo();

        outputInfo(mach1);
        outputInfo(person1);
    }

    private static void outputInfo(Info info){
        info.showInfo();
    }

}
