package org.burakcimtay.departman;

import lombok.*;
import org.burakcimtay.base.Personel;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Yazilimci extends Personel {

    private String calismaDurumu;

    public void bilgisiniyaz(Yazilimci yazilimci){
        System.out.println("Adı: " + yazilimci.getAdi());
        System.out.println("Soyadı: " + yazilimci.getSoyadi());
        System.out.println("Çalışma Durumu: " + yazilimci.getCalismaDurumu());
    }

}
