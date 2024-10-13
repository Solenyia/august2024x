package org.example.sept24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App13_9_Exceptions2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\marti\\IdeaProjects\\august2024\\src\\main\\java\\org\\example\\sept24\\test.txt");

        try {
            FileReader fr = new FileReader(file);
            System.out.println("The Program Works");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getName());
        }
    }
}
