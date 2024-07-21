package org.burakcimtay.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AppMain {
    public static void main(String[] args) {
        Stream<String> bosKayit = Stream.empty();

        System.out.println("bosKayit: " + bosKayit);
        System.out.println("-----------------------");

        Stream<String> tekKayit = Stream.of("Burak");
        System.out.println("tekKayit: " + tekKayit);
        System.out.println("-----------------------");

        Stream<String> cokluKayit = Stream.of("Burak", "Mimar", "Emre");
        System.out.println("cokluKayit: " + cokluKayit);
        System.out.println("-----------------------");

        List<String> ogrenciListesi = List.of("Ramazan", "İlyas", "Emre", "Eyüp");
        System.out.println("ogrenciListesi: " + ogrenciListesi);

        System.out.println("-----------------------");

        Stream <String> ogrencilerStream = ogrenciListesi.stream();
        //ogrencilerStream.forEach(System.out::println);
        ogrencilerStream.forEach(ogrenci -> System.out.println(ogrenci)); // Aynı kullanım

        System.out.println("-----------------------");

        var kelimeDizisi = new String [] {"Burak", "Barış", "Aslan"};

        for (String kelime : kelimeDizisi){
            System.out.println(kelime);
        }

    }
}
