package org.burakcimtay.v2;

public class Personel {

    public void ekranaYaz() {
        System.out.println("Ekrana Yaz");
    }

    public <GelenTip1, GelenTip2> void ekranaYaz(GelenTip1 sira, GelenTip2 isim) {
        System.out.println("Sıra: " + sira + " İsim: " + isim);
        System.out.println("Sıra Tip: " + sira.getClass());
        System.out.println("İsim Tip: " + isim.getClass());
        System.out.println("\n-------------------\n");
    }
}
