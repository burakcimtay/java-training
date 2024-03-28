package org.burakcimtay;
import java.util.StringJoiner;

public class Yatirimci {
    private String adi;
    private String soyadi;
    private String subeAdi;
    private long hesapNo;
    private Integer ibanNo;
    private Float bakiye;

    public Yatirimci() {
        System.out.println("Parametresiz yatırımcı oluşturuldu.");
    }

    public Yatirimci(String adi, String soyadi, String subeAdi, Long hesapNo, Integer ibanNo, Float bakiye) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.subeAdi = subeAdi;
        this.hesapNo = hesapNo;
        this.ibanNo = ibanNo;
        this.bakiye = bakiye;

        System.out.println("6 Parametreli yatırımcı oluşturuldu.");
    }

    public Yatirimci(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;

        System.out.println("2 Parametreli yatırımcı oluşturuldu.");
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getSubeAdi() {
        return subeAdi;
    }

    public void setSubeAdi(String subeAdi) {
        this.subeAdi = subeAdi;
    }

    public long getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(long hesapNo) {
        this.hesapNo = hesapNo;
    }

    public Integer getIbanNo() {
        return ibanNo;
    }

    public void setIbanNo(Integer ibanNo) {
        this.ibanNo = ibanNo;
    }

    public Float getBakiye() {
        return bakiye;
    }

    public void setBakiye(Float bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Yatirimci.class.getSimpleName() + "[", "]")
                .add("adi='" + adi + "'")
                .add("soyadi='" + soyadi + "'")
                .add("subeAdi='" + subeAdi + "'")
                .add("hesapNo=" + hesapNo)
                .add("ibanNo=" + ibanNo)
                .add("bakiye=" + bakiye)
                .toString();
    }
}
