package org.burakcimtay.v1;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {
    public static void main(String[] args) {
        Stream<String> myStream = Stream.of("Barış", "İlhan", "Berke", "Emre", "Emre", "Emre");

        TreeSet<String> myThreeSet = myStream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(myThreeSet);

        System.out.println("---------------------");

        Stream<String> myStream2 = Stream.of("Barış", "İlhan", "Berke", "Emre", "Emre", "Emre");
        TreeSet<String> myThreeSet2 = myStream2.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(myThreeSet2);

        System.out.println("---------------------");

        Stream<String> myStream3 = Stream.of("Barış", "İlhan", "Berke", "Emre", "Emre", "Emre");

        myStream3.sorted().distinct().forEach(System.out::println);

        System.out.println("---------------------");

        Stream<String> myStream4 = Stream.of("Barış", "İlhan", "Berke", "Emre", "Emre", "Emre");

        HashSet <String> myHashSet = myStream4.sorted().filter(isim -> !isim.contains("e") || isim.startsWith("B")).collect(Collectors.toCollection(HashSet::new));

        System.out.println(myHashSet);

    }
}
