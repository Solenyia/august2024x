package org.example.sept24.App18_9_tryWiReso;

import java.io.*;

public class App2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\marti\\IdeaProjects\\august2024\\src\\main\\java\\org\\example\\sept24\\App18_9_tryWiReso\\test.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))){

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found " + file.getName());
        } catch (IOException e) {
            System.out.println("Unable to read File" + file.toString());
        }
    }
}
