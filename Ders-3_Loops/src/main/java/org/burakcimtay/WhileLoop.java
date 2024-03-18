package org.burakcimtay;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("------------------WHILE----------------");
        int i=0;
        while (i<5){
            System.out.println(i);
            i++;
        }

        System.out.println("-----------------DO WHILE-----------------");

        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);
    }
}
