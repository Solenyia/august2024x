package org.example.sept24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App13_9_Exceptions {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");

        FileReader fr = new FileReader(file);
    }
}
