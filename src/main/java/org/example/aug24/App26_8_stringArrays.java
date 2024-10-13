package org.example.aug24;

public class App26_8_stringArrays {
    public static void main(String[] args) {
        String[] words = new String[3];
        //alokujem pamat pre 3 referencie stringu

        words[0] = "Hello";
        //element 1, alokacia pamate pre konkretne casti stringu
        words[1] = "World";
        //element 2
        words[2] = "!";
        //element 3

        System.out.println(words[2]);

        String[] fruits = {"apple", "banana", "watermelon", "kiwi"};

        for(String fruit : fruits) {
            //deklaracia fruit typu stringu, za : je meno pola cez ktore budem iterovat
            System.out.println(fruit);
        }

        int value = 0;

        String text = null;
        // alokacia dostatocne pamate na referenciu na String

        System.out.println(text);

        String[] texts = new String[2];
        // texts referuje na pole stringov

        System.out.println(texts[0]);

        texts[0] = "one";
    }
}
