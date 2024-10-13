package org.testProgramy.Permutation_5;

import org.testProgramy.Factor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x;
        int y;

        Scanner reader = new Scanner(System.in);
        Factor factor = new Factor();
        //deklaracia pomocou Factor


        System.out.println("Zadaj prve cislo: ");
        x = reader.nextInt();

        System.out.println("Zadaj druhe cislo: ");
        y = reader.nextInt();

        System.out.println("NCR = " + (factor.vypocet(x) / (factor.vypocet(x - y) * factor.vypocet(y))));
        System.out.println("NCR = " + (factor.vypocet(x) / factor.vypocet(x - y)));
    }
}
