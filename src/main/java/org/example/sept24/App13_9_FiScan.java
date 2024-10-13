package org.example.sept24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App13_9_FiScan {
    public static void main(String[] args) throws FileNotFoundException {
        //String fileName = "C:\\Users\\marti\\IdeaProjects\\august2024\\src\\main\\java\\org\\example\\sept24\\example.txt";
        String fileName = "example.txt";

        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);

        int value = in.nextInt();
        System.out.println("Read value: " + value);

        in.nextLine();

        int count = 2;

        while (in.hasNextLine()) {
            String line = in.nextLine();

            System.out.println(count + ": " + line);
            count++;
        }
        ;

        in.close();
    }
}
