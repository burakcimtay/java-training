package org.burakcimtay;

public class Kedi {
    int yas;
    String Renk;

    public Kedi(int yas, String renk) {
        this.yas = yas;
        this.Renk = renk;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void setRenk(String renk) {
        this.Renk = renk;
    }

    public int getYas() {
        return yas;
    }

    public String getRenk() {
        return Renk;
    }

    public static void main(String[] args) {

        Kedi kedi1 = new Kedi(1, "Beyaz");
        Kedi kedi2 = new Kedi(2, "Beyaz");
        Kedi kedi3 = new Kedi(3, "Beyaz");

        System.out.println(kedi1.yas + " " + kedi1.Renk);
        System.out.println(kedi2.yas + " " + kedi2.Renk);
        System.out.println(kedi3.yas + " " + kedi3.Renk + "\n");

        kedi1.setYas(6);
        kedi2.setYas(7);
        kedi3.setYas(8);

        kedi1.setRenk("Siyah");
        kedi2.setRenk("Turuncu");
        kedi3.setRenk("Kahverengi");

        System.out.println("Get " + kedi1.getYas() + " " + kedi1.getRenk());
        System.out.println("Get " + kedi2.getYas() + " " + kedi2.getRenk());



    }
}