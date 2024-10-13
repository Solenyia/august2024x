package org.example.sept24.demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class except3 {
    public static void main(String[] args) throws FileNotFoundException {
        openFile();
    }

    public static void openFile() throws FileNotFoundException {
        File file = new File("C:\\Users\\marti\\IdeaProjects\\august2024\\src\\main\\java\\org\\example\\sept24\\test.txt");

        FileReader fr = new FileReader(file); 
    }
}
