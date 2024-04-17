package org.burakcimtay;

import lombok.*;

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
}
