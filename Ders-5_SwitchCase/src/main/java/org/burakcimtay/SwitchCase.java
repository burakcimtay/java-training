package org.burakcimtay;

public class SwitchCase {

    public static void main(String[] args) {
        int secilen = 55;
        switch (secilen){
            case 0:
                System.out.println("Ana menüye dön. ");
                break;
            case 1:
                System.out.println("Gidilecek menu: " + 1);
                break;
            case 2:
                System.out.println("Gidilecek menu: " + 2);
                break;
            case 3:
                System.out.println("Gidilecek menu: " + 3);
                break;
            default:
                System.out.println("Kapatılıyor.");
                break;
        }
    }
}