package org.burakcimtay.v3;
public class AppMain {

    public static void main(String[] args) {

        Personel<Integer, String> personel1 = new Personel<>(100, "Abdullah");
        Personel<Integer, String> personel2 = new Personel<>(200, "Fehim");

        personel1.yazdir();
        personel2.yazdir();

    }
}
