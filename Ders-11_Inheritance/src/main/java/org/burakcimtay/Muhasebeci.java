package org.burakcimtay;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Muhasebeci extends Personel{

    private boolean yeminDurumu;
    private String unvani;

    private String yemin;
    public void bilgisiniyaz(Muhasebeci muhasebeci){
        if(yeminDurumu)
            yemin = "Yeminli";
        else
            yemin = "Yeminsiz";

        System.out.println("Ünvanı: " + muhasebeci.getUnvani());
        System.out.println("Yemin Durumu: " + yemin);
    }

}
