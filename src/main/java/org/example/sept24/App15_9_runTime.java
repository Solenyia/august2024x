package org.example.sept24;

public class App15_9_runTime {
    public static void main(String[] args) {

        String[] texts = {"one", "two", "three", "four", "five"};

        try{
            System.out.println(texts[6]);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
