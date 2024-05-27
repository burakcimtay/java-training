package org.burakcimtay;

public abstract class Hayvan extends Canli {

    public void yemekYe() {
        System.out.println("Hayvan Yemek Ye");
    }

    public abstract void sesVer();
    public abstract void hareketEt();
    public abstract void bilgisiniGetir();

}
