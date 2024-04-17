package org.burakcimtay.tasit;

import lombok.*;
import org.burakcimtay.kural.Kanun;
import org.burakcimtay.base.Arac;

@Setter
@Getter
@ToString(callSuper = true)
public class Bisiklet extends Arac implements Kanun {
    @Override
    public int hiz_siniri() {
        return 30;
    }

    @Override
    public String bakim_durumu() {
        return "Mart";
    }

    @Override
    public int mtv() {
        return 0;
    }
}
