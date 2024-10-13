package org.testProgramy.Factorial_2;

import org.testProgramy.Factor;

import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        int parameter;
        int summ = 1;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        parameter = reader.nextInt();

        while(parameter > 1)
        {

            summ = summ * (parameter);
            parameter--;
            System.out.println("cislo: " + summ);
        }
    }

}
