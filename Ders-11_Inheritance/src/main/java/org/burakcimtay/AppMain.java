package org.burakcimtay;

public class AppMain {
    public static void main(String[] args) {

        Mudur mudur = new Mudur();
        mudur.setAdi("Burak");
        mudur.setSoyadi("Cimtay");
        mudur.setDepartman("Siber Güvenlik");
        mudur.setMakamAraci(true);
        mudur.setSicilNo(192837);
        mudur.setTahsilDurumu("Master");
        mudur.setTecrubeYili((short) 15);
        System.out.println(mudur);
        mudur.bilgisiniyaz(mudur);
        mudur.setTelefonNo("05325325598");

        System.out.println("--------------------------");

        Yazilimci yazilimci = new Yazilimci();

        yazilimci.setAdi("Engin");
        yazilimci.setSoyadi("Okcu");
        yazilimci.setDepartman("Yazilim");
        yazilimci.setCalismaDurumu("Hybrit");
        yazilimci.setSicilNo(123412);
        yazilimci.setTahsilDurumu("Master");
        yazilimci.setTecrubeYili((short) 3);
        yazilimci.setTelefonNo("05330001122");

        System.out.println(yazilimci);
        yazilimci.bilgisiniyaz(yazilimci);

        System.out.println("--------------------------");

        Muhasebeci muhasebeci = new Muhasebeci();

        muhasebeci.setAdi("Ongun");
        muhasebeci.setSoyadi("Okatan");
        muhasebeci.setDepartman("Satış");
        muhasebeci.setYeminDurumu(true);
        muhasebeci.setSicilNo(123412);
        muhasebeci.setTahsilDurumu("Üniversite");
        muhasebeci.setTecrubeYili((short) 3);
        muhasebeci.setTelefonNo("05075559281");
        muhasebeci.setUnvani("Mali Müşavir");

        System.out.println(muhasebeci);
        muhasebeci.bilgisiniyaz(muhasebeci);



    }
}