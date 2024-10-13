package org.example.aug24;

import java.util.Scanner;

public class App24_8_Scanner {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Output the prompt
        // System.out.println("Enter a line of text: ");
        System.out.println("Enter a floating point value: ");

        // Wait for the user to enter a line of text
        // String line = input.nextLine();

        // Wait for the user to enter something (moze byt len cele cislo (int))
        // int value = input.nextInt();
        double value = input.nextDouble();

        // Tell them the inputed text
        System.out.println("You printed : " + value);
    }
}
