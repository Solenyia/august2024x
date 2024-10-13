package org.example.aug24;

public class App31_8_Stringy {
    public static void main(String[] args) {
        // Inefficient
        String info = "";

        info += "My name 123";
        info += " ";
        info += "I am a builder";

        System.out.println(info);

        //More efficient
        StringBuilder builder = new StringBuilder("");

        builder.append("My Name is Sue");
        builder.append(" ");
        builder.append("I am a builder");

        System.out.println(builder.toString());
        // da vsetko z buildera do textu

        StringBuilder sb = new StringBuilder();

        sb.append("My Name is Sue")
        .append(" ")
                //ak tam nedam ; tak mozem spamovat .append
        .append("and I like people");

        System.out.println(sb.toString());

        ///// Formatting /////

        System.out.println("Here is some text \t That was a tab \n that was new line");
        //println dava aj novy riadok, print nie
        System.out.print(" More text");

        //Formating integers
        System.out.printf("Total cost %d; quantity os %d\n", 5, 120);
        //printf hlada %nieco a k tomu hodnotu za uvodzovkami

        for(int i=0; i<20; i++){
            System.out.printf("%-2d : %s\n", i, " toto je text");
            //%2d sposobi ze aj jednociferne aj dvojciferne cisla budu zarovno
        }

        System.out.printf("Total value %.2f; quantity os %d\n", 5.22, 120);
        System.out.printf("Total value %3.1f; quantity os %d\n", 125.221231, 120);
    }


}
