package org.burakcimtay.v1;

import java.util.ArrayList;

public class PersonelList <T, A, B> {

    ArrayList <T> myArrayPersonList = new ArrayList<>();

    public void listeyeEkle(T eklenecekDeger) {
        myArrayPersonList.add(eklenecekDeger);
    }

    public ArrayList <T> listeyiGetir() {
        return myArrayPersonList;
    }
}
