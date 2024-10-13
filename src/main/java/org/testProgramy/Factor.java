package org.testProgramy;

import java.util.Scanner;

public class Factor {
    public int vypocet(int parameter){
        int summ = 1;
        Scanner reader = new Scanner(System.in);

        while (parameter > 1) {

            summ = summ * (parameter);
            parameter--;
        }
        return summ;
    }

    public static void main(String[] args) {
    }

}
