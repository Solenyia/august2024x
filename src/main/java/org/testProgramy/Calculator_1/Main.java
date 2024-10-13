package org.testProgramy.Calculator_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float first;
        float second;

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter first number: \n");
        first = reader.nextFloat();

        System.out.println("Enter opperand: ");
        char opperand = reader.next().charAt(0);

        System.out.println("Enter second number");
        second = reader.nextFloat();

        float sumarum = 0;

        switch (opperand) {
            case '+':
                sumarum = first + second;
                break;
            case '*':
                sumarum = first * second;
                break;
            case '/':
                sumarum = first / second;
                break;
            case '-':
                sumarum = first - second;
                break;
            default:
                System.out.println("There is a wrong opperand");
                return ;
        }

        System.out.println("The result is :" + sumarum + "\tWith opperand: " + opperand);
    }
}
