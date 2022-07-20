package Massiv;


public class Main {
    public static void main(String[] args) {
        String[] strings = new String[7];
        strings[0] = "1";
        strings[1] = "2";
        strings[2] = "3";
        strings[3] = "4";
        strings[4] = "5";
        strings[5] = "6";
        strings[6] = "7";
        System.out.println(strings[6]);


        char symbol = 'a';
        String[][] strings1 = new String[3][6];
        for (int i = 0; i < strings1.length; i++) {
            for (int j = 0; j < strings1[0].length; j++) {
                strings1[i][j] = symbol + "" + (j+1);
                System.out.print(strings1[i][j] + " ");
            }
            symbol++;
            System.out.println();
        }

        char [][] array = {{'r', 'h'},
                {'y', 'g'},
                {'b', 'f'},
                {'s','e'}};

        for (char[] row : array) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        int[][] array2 = new int[5][8];
        int [][] maxmin = new int[5][2];

        for (int i = 0; i < array2.length;i++) {
            for (int j = 0; j < array2[0].length; j++) {
                array2[i][j] = (int) (Math.random() * 50);
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array2.length;i++) {
            maxmin[i][0] = array2[i][0];
            maxmin[i][1] = array2[i][0];
            for (int j = 0; j < array2[0].length; j++) {
                if (maxmin[i][0] < array2[i][j]) {
                    maxmin[i][0] = array2[i][j];
                } else if (maxmin[i][1] > array2[i][j]) {
                    maxmin[i][1] = array2[i][j];
                }
            }
        }

        for (int[] roww : maxmin) {
            for (int element : roww) {
                System.out.print(element + " ");
            }
            System.out.println();
        }



    }
}
