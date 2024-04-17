package org.burakcimtay;

import lombok.*;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Yazilimci extends Personel{

    private String calismaDurumu;

    public void bilgisiniyaz(Yazilimci yazilimci){
        System.out.println("Çalışma Durumu: " + yazilimci.calismaDurumu);
    }

}
