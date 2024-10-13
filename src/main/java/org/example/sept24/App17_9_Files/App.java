package org.example.sept24.App17_9_Files;

import java.io.*;
import java.nio.Buffer;

public class App {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\marti\\IdeaProjects\\august2024\\src\\main\\java\\org\\example\\sept24\\App17_9_Files\\text.txt");

        BufferedReader br = null;

        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file: " + file.toString());
            } catch (NullPointerException ex) {
                // File was never opened!
            }
        }
    }
}
