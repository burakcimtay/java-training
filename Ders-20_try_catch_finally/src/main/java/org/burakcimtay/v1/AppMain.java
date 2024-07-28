package org.burakcimtay.v1;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {
        try {
            sifirabolmehatasi();
        }
        catch (Exception e){
            System.out.println("Hata: " + e.getMessage());
        } finally{
            System.out.println("Teşekkür ederiz.");
        }

        System.out.println("----------------------------------------");

    }

    private static void sifirabolmehatasi() {
        //sonuc = 2/0;
        throw new ArithmeticException("Aritmetic Exception Meydana Geldi");
    }
}
