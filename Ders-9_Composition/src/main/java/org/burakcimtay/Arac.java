package org.burakcimtay;

public class Arac {

    public int yas;
    public String marka = new String();
    private Motor motor = new Motor();
    private Ayna ayna = new Ayna();
    private Depo depo = new Depo();
    private Direksiyon direksiyon = new Direksiyon();
    private Koltuk koltuk = new Koltuk();

    public Arac() {
        System.out.println("Arac oluşturuldu.");
    }

    // set get

    // methodlar

    public String calistir(){

        return "Araç çalıştı.";

    }

}