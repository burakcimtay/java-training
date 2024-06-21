package org.burakcimtay.v2;

import java.util.ArrayList;
import java.util.LinkedList;

public class AppMain {
    public static void main(String[] args) {
        Personel obj = new Personel();
        obj.ekranaYaz();
        obj.ekranaYaz(10, "Burak");
        obj.ekranaYaz(10.5f, 25);
        obj.ekranaYaz(15.3, true);

        LinkedList <Integer> ogrenciNoList = new LinkedList();
        ogrenciNoList.add(10);
        ogrenciNoList.add(20);
        ogrenciNoList.add(30);

        ArrayList <String> ogrenciIsimList = new ArrayList();
        ogrenciIsimList.add("Burak");
        ogrenciIsimList.add("Emre");
        ogrenciIsimList.add("Dogukan");

        obj.ekranaYaz(ogrenciNoList, ogrenciIsimList);

    }
}
