package org.burakcimtay;

import org.burakcimtay.bahce.Ayi;
import org.burakcimtay.base.Hayvan;
import org.burakcimtay.veteriner.Kedi;
import org.burakcimtay.veteriner.Kopek;
import org.burakcimtay.veteriner.Kus;

public class AppMain {
    public static void main(String[] args) {

        Kedi kedi = new Kedi();
        System.out.println("-----------------");
        Kopek kopek = new Kopek();
        System.out.println("-----------------");
        Kus kus = new Kus();
        System.out.println("-----------------");

        kedi.sesVer();
        kopek.sesVer();
        kus.sesVer();

        if(kedi instanceof Hayvan){
            System.out.println("Evet: " + kedi);
        }
        else{
            System.out.println("Hayır " + kedi);
        }

        Hayvan hayvan = new Hayvan();

        // hayvan.sesVer();

        Ayi ayi = new Ayi();
        ayi.sesVer();

    }
}