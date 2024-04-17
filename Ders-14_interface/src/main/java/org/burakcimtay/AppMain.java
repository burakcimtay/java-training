package org.burakcimtay;

import org.burakcimtay.tasit.Taksi;
import org.burakcimtay.tasit.Ucak;

public class AppMain {
    public static void main(String[] args) {
        Ucak ucak = new Ucak();
        Taksi taksi = new Taksi();

        ucak.setMarka("Boeing");
        ucak.setKoltuk_sayisi((short)200);
        ucak.setTeker_sayisi((short)10);

        System.out.println(ucak);

        taksi.ehliyet_durumu(true);
        taksi.ruhsat_durumu(false);


    }
}