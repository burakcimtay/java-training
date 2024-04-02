package org.burakcimtay;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Mudur extends Personel{

    private Boolean makamAraci;

    public Mudur() {
    }

    public Mudur(String adi, String soyadi, String departman, String telefonNo,
                 int sicilNo, String tahsilDurumu, short tecrubeYili, Boolean makamAraci) {
        super(adi, soyadi, departman, telefonNo, sicilNo, tahsilDurumu, tecrubeYili);
        this.makamAraci = makamAraci;
    }

    private String makamAraciDurumu;
    public void bilgisiniyaz(Mudur mudur){

        if(makamAraci){
            makamAraciDurumu = "Var";
        }

        else{
            makamAraciDurumu = "Yok";
        }

        System.out.println("Makam Araci: " + makamAraciDurumu);

    }

}