package org.burakcimtay;

public class ForEach {
    public static void main(String[] args) {
        String [] students = {"Burak", "Ali", "Emre", "Veli"};

        System.out.println("---------------FOR-----------------");

        for(int i=0; i < students.length; i++){
            System.out.println(students[i]);
        }

        System.out.println("---------------FOR EACH STRING-----------------");

        for(String student:students){
            System.out.println(student);
        }

        System.out.println("---------------FOR EACH INT-----------------");

        int [] yillar = {2000, 2001, 2002, 2003, 2004};

        for(int yil: yillar){
            System.out.println(yil);
        }

    }
}
