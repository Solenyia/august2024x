package org.example.aug24;

public class App26_8_MultDArrays {
    public static void main(String [] args) {
        int[] values = {3, 5, 2343};

        System.out.println(values[2]);

        int[][] grid = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);

        String[][] texts = new String[2][3];

        System.out.println(texts[0][1]);

        texts[0][1] = "Hello World";

        System.out.println(texts[0][1]);

        for(int row =0; row< grid.length; row++){
            for(int col =0; col < grid[row].length; col++){
                System.out.print(grid[row][col] + "\t");
            }

            System.out.println();
        }

        String[][] words = new String[2][3];

        System.out.println(words[0][1]);
        // nic na tom mieste nie je, vypise null

        words[0] = new String[3];
        // do pola words prirobi riadky/stlpce (3), spravi z neho dvojrozmerne pole

        words[0][1] = "Hello World";

        System.out.println(words[0][1]);

    }
}
