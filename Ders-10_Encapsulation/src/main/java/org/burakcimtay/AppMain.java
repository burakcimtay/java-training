package org.burakcimtay;

public class AppMain {
    public static void main(String[] args) {

        Yatirimci yatirimci1 = new Yatirimci();
        Yatirimci yatirimci2 = new Yatirimci("Burak", "Cimtay", "Pendik",
                123189721424L, 12983713, 172_312F);
        Yatirimci yatirimci3 = new Yatirimci("Burak", "Cimtay");

        System.out.println(yatirimci1);
        System.out.println(yatirimci2);
        System.out.println(yatirimci3);

        yatirimci1.setAdi("Emre");
        yatirimci1.setSoyadi("Aslan");
        yatirimci1.setBakiye(11293F);
        yatirimci1.setHesapNo(1297312983L);
        yatirimci1.setIbanNo(1298371293);
        yatirimci1.setSubeAdi("Kadıköy");

        System.out.println("\n" + yatirimci1 + "\n");

        System.out.println(yatirimci2.getAdi() + "   " + yatirimci2.getSoyadi() + "   " + yatirimci2.getHesapNo());

    }
}