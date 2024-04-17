package org.burakcimtay.base;

import lombok.*;
import org.burakcimtay.departman.Yazilimci;

@Setter
@Getter
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Personel {
    private String adi;
    private String soyadi;
    private String departman;
    private String telefonNo;
    private int sicilNo;
    private String tahsilDurumu;
    private short tecrubeYili;

    public void bilgisiniyaz(Personel personel){
        System.out.println("Adı: " + personel.getAdi());
        System.out.println("Soyadı: " + personel.getSoyadi());
    }

    public void metod(int yil, int ay, int gun){

    }
    public void metod(short yil, int ay, int gun){

    }
    public void metod(int yil, short ay, int gun){

    }
    public void metod(int yil, int ay, short gun){

    }
    public void metod(short yil, short ay, short gun){

    }


}
