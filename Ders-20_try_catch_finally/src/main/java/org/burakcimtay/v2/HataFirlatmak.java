package org.burakcimtay.v2;

public class HataFirlatmak {
    public static void main(String[] args) {

        try {
            int sonuc = urunlerinSayisiniAlChecked(13);
            //int sonuc = urunlerinSayisiniAlUnchecked(13);
            System.out.println("Ürün sayısı: " + sonuc);
        }
        catch (Exception e){
            System.out.println("Hata: " + e.getMessage());
        }finally {
            System.out.println("Teşekkürler.");
        }
    }

    private static int urunlerinSayisiniAlUnchecked(int kabinSayisi) {

        int uretilenUrunSayisi = 100;

        if (kabinSayisi<0 || kabinSayisi>25){
            throw new ArithmeticException("Lütfen Kabin Sayısını Doğru Giriniz.");
        }
        else {
            return uretilenUrunSayisi;
        }
    }

    private static int urunlerinSayisiniAlChecked(int kabinSayisi) throws Exception{

        int uretilenUrunSayisi = 100;

        if (kabinSayisi<0 || kabinSayisi>25){
            throw new ArithmeticException("Lütfen Kabin Sayısını Doğru Giriniz.");
        }
        else {
            return uretilenUrunSayisi;
        }
    }
}
