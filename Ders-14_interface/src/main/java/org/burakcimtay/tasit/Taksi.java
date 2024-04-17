package org.burakcimtay.tasit;

import lombok.*;
import org.burakcimtay.kural.Kanun;
import org.burakcimtay.kural.UlastirmaDairesi;
import org.burakcimtay.base.Arac;

@Setter
@Getter
@ToString(callSuper = true)
public class Taksi extends Arac implements Kanun, UlastirmaDairesi {
    @Override
    public int hiz_siniri() {
        return 80;
    }

    @Override
    public String bakim_durumu() {
        return "Haziran";
    }

    @Override
    public int mtv() {
        return 1500;
    }

    @Override
    public Boolean ruhsat_durumu(Boolean durum) {
        return durum;
    }

    @Override
    public Boolean ehliyet_durumu(Boolean durum) {
        return durum;
    }

}
