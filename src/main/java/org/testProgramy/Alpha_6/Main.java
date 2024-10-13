package org.testProgramy.Alpha_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        char pole[][] = new char[7][4];
//        // int pole[][] = new int[y-riadok][x-stlpec];
//
//        for (int riadok = 0; riadok < 7; riadok++) {
//            for (int stlpec = 0; stlpec < 4; stlpec++) {
//                pole[riadok][stlpec] = '*';
//                if ((riadok == 0 & stlpec == 0) || (riadok == 0 & stlpec == 3)) {
//                    pole[riadok][stlpec] = ' ';
//                }
//
//                if (stlpec == 1 || stlpec == 2) {
//                    if ((riadok == 0 || riadok == 3)) {
//                        pole[riadok][stlpec] = '*';
//
//                    }
//                    else {
//                        pole[riadok][stlpec] = ' ';
//                    }
//
//                }
//                System.out.printf(" %c", pole[riadok][stlpec]);
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//
//
//                if (stlpec == 3) {
//                    System.out.printf("\n");
//                }
//
//            }
//        }
//
        int n = 0;
        int m = 0;
        int i = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Zadaj pocet riadkov");
        n = reader.nextInt();
        i = n - 1;

        while (n > 0) {
            if (m < i) {
                System.out.printf(" ");
                m++;
            } else {
                System.out.printf("*");
            }
            n--;
        }

    }
}