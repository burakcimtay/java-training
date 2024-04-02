package org.burakcimtay;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
public class Yazilimci extends Personel{

    private String calismaDurumu;

    public void bilgisiniyaz(Yazilimci yazilimci){
        System.out.println("Çalışma Durumu: " + yazilimci.calismaDurumu);
    }

}
