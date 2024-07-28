package org.burakcimtay;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Optional;

public class AppMain {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        System.out.println(student.getFirstName());
        System.out.println(student.getIdNumber());
        System.out.println(student.getLastName());

        System.out.println("--------------------------------");

        Student student2 = new Student("Barış");
        System.out.println(student2);
        System.out.println(student2.getFirstName());
        System.out.println(student2.getIdNumber());
        System.out.println(student2.getLastName());

        System.out.println("--------------------------------");

        student2 = null;

        try {
            System.out.println(student2.getFirstName());
        } catch (Exception e) {
            System.out.println(e);
        }

        String[] myArray = new String[10];
        myArray[6] = "abc";
        String myWord = myArray[6].toUpperCase();
        System.out.println(myWord);

        myArray[6] = null;
        //System.out.println(myArray[6].toUpperCase());

        String[] myArray2 = new String[10];
        Optional<String[]> nullControl = Optional.ofNullable(myArray2);
        System.out.println(nullControl.get()); //Optional içerisindeki nesneyi çıkarmak için get kullan

        System.out.println("--------------------------------");

        myArray2 = null;
        Optional<String[]> nullControl2 = Optional.ofNullable(myArray2);
        System.out.println(nullControl2); //Optional içerisindeki nesneyi çıkarmak için get kullan

        if(nullControl2.isEmpty()){
            System.out.println("Dizi Boş");
        }
        else {
            System.out.println("Dizi Dolu");
        }

    }
}