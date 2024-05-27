package org.burakcimtay;

import java.util.ArrayList;

public class PersonelList <T> {

    ArrayList myArrayList = new ArrayList();

    public void listeyeEkle(T veri) {
        myArrayList.add(veri);
    }

    public void listeyiGetir() {
    }
}
