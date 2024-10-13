package org.example.sept24;

import org.example.model.Test;

import java.io.IOException;
import java.text.ParseException;

public class App15_9_multExcep {
    public static void main(String[] args) throws IOException, ParseException {
        Test test = new Test();

        /*
        try{
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        */

        try {
            test.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
