package org.example.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {
    public void run() throws IOException, ParseException {
        //throw new IOException();

        throw new ParseException("Error at cmd list", 2);

    }

    public void input() throws IOException, FileNotFoundException {

    }
}
