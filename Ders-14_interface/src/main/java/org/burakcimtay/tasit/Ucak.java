package org.burakcimtay.tasit;

import lombok.*;
import org.burakcimtay.kural.HavacilikDernegi;
import org.burakcimtay.kural.Kanun;
import org.burakcimtay.base.Arac;

@Setter
@Getter
@ToString(callSuper = true)
public class Ucak extends Arac implements Kanun, HavacilikDernegi {
    @Override
    public int hiz_siniri() {
        return 800;
    }

    @Override
    public String bakim_durumu() {
        return "Haftalık";
    }

    @Override
    public int mtv() {
        return 18000;
    }

    @Override
    public Boolean uyelik_durumu() {
        return Boolean.TRUE;
    }

    @Override
    public int aidat() {
        return 2000;
    }
}
