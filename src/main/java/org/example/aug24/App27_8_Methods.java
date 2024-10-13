package org.example.aug24;

import org.example.model.Robot;
//importujem cestu classy ktoru potrebujem

public class App27_8_Methods {
    public static void main(String[] args) {
        Robot john = new Robot();

        john.speak("Hi Im John");
        john.jump(12);
        john.move("west", 15.2);

        String greeting = "Hello there.";
        john.speak(greeting);
        // do greetingu davam text, ktory davam ako parameter john.speak
    }
}
