package org.burakcimtay.v1;

import java.util.ArrayList;

public class AppMain {
    public static void main(String[] args) {
        ArrayList myArrayList = new ArrayList<>();

        myArrayList.add("A");
        myArrayList.add(10);
        myArrayList.add(true);

        ArrayList <String> myArrayList2 = new ArrayList<>();

        myArrayList2.add("Burak");
        myArrayList2.add("Java");
        myArrayList2.add("Yazı");
        myArrayList2.add(String.valueOf(10000));
        myArrayList2.add(""+9999);

        PersonelList <String, Integer, Boolean> myPersonelList = new PersonelList();

        myPersonelList.listeyeEkle("Burak");
        myPersonelList.listeyeEkle("Emre");
        myPersonelList.listeyeEkle("Can");
        myPersonelList.listeyeEkle("Dogukan");
        System.out.println(myPersonelList.listeyiGetir());


    }
}