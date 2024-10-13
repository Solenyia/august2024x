package org.testProgramy.Palindrome_4;

import java.util.Scanner;

public class Main {

    static void checkPalidrome(String input){
        boolean result = true;
        int lenght = input.length();

        for(int i = 0; i < (lenght/2); i++)
        {
            if(input.charAt(i) != input.charAt(lenght-i-1)){
                result = false;
                break;
            }
        }
        System.out.println(input + " is palidrome " + result);
    }

    public static void main(String[] args)
    {
        String input;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a word: ");
        input = reader.nextLine();

        checkPalidrome(input);
    }
}
