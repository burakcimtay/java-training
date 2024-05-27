package org.burakcimtay;

import java.util.ArrayList;

public class AppMain {
    public static void main(String[] args) {
        ArrayList myArrayList = new ArrayList();

        myArrayList.add("A");
        myArrayList.add(10);
        myArrayList.add(true);

        ArrayList <String> myArrayList2 = new ArrayList();
        myArrayList2.add("B");
        myArrayList2.add(String.valueOf(1000));
        myArrayList2.add(""+1000);

        PersonelList <String> myPersonelList = new PersonelList();
        PersonelList <Integer> myPersonelList2 = new PersonelList();
        PersonelList myPersonelList3 = new PersonelList();

        myPersonelList3.listeyeEkle("Deneme");
        myPersonelList3.listeyiGetir(123);
    }
}