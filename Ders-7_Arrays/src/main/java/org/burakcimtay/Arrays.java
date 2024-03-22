package org.burakcimtay;

public class Arrays {
    public static void main(String[] args) {
        int sayilar [] = {10, 15, 20, 25};
        short myArray [] = new short [5];
        int myArray2 [][] = new int[3][5];

        int k = 0;

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

        System.out.println("-------------------");

        for (short i = 0; i < myArray.length; i++) {
            myArray[i] = (short)(i+20);
            System.out.println(myArray[i]);
        }

        System.out.println("-------2D Arrays-------");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                myArray2[i][j] = k+20;
                k++;
                System.out.print(myArray2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(java.util.Arrays.deepToString(myArray2));
    }

}