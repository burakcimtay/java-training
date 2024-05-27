package org.burakcimtay;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {

        Integer myNum1;
        Integer myNum2;
        Integer myNum3;

        Integer [] myNums;

        List <Integer> myList;

        myList = new ArrayList<>();

        System.out.println(myList);
        System.out.println("--------------------------");

        myList = new LinkedList<>();

        System.out.println(myList);

        System.out.println("--------------------------");

        ArrayList <String> myList2 = new ArrayList<>();

        System.out.println(myList2);

        System.out.println("--------------------------");

        myList.add(5);
        myList.add(10);
        myList.add(7);
        myList.add(15);
        myList.add(null);

        myList2.add("Burak");
        myList2.add("Ahmet");
        myList2.add("Emre");
        myList2.add(null);

        System.out.println("Liste 1 Elemanları: " + myList);
        System.out.println("Liste 2 Elemanları: " + myList2);

        System.out.println("--------------------------");

        System.out.println("Liste 1 içinde 7 var mı?: " + myList.contains(7));
        System.out.println("Liste 2 içinde Öykü var mı?: " + (myList2.contains("Öykü") ? "Var":"Yok"));
        System.out.println("Liste 2 içinde Burak var mı?: " + (myList2.contains("Burak") ? "Var":"Yok"));

        System.out.println("--------------------------");

        List <Integer> myList3;
        myList3 = new LinkedList<>();

        myList3.add(5);
        myList3.add(10);
        myList3.add(7);
        myList3.add(15);
        myList3.add(null);

        System.out.println("Liste 1 ve liste 2 birbirine eşit mi?: " + (myList.equals(myList2) ? "Evet":"Hayır"));
        System.out.println("Liste 1 ve liste 3 aynı listeler mi? Bellekte ikisi de aynı mı?: " + (myList == myList3));

        System.out.println("--------------------------");

        ArrayList <String> myList4 = new ArrayList<>();

        System.out.println("Liste 1 kaç elemanlı?: " + myList.size());
        System.out.println("Liste 4 boş mu?: " + (myList4.isEmpty() ? "Evet":"Hayır"));

        System.out.println("--------------------------");

        myList3.add(123);
        myList3.add(150);
        myList3.add(300);
        myList3.add(500);

        System.out.println("Liste 3 ilk hali: " + myList3);
        System.out.println("Liste 3 kaç elemanlı?: " + myList3.size());

        myList3.removeAll(myList);

        System.out.println("Liste 3 son hali: " + myList3);
        System.out.println("Liste 3 kaç elemanlı?: " + myList3.size());

        System.out.println("--------------------------");

        System.out.println("Hash code List1: " + myList.hashCode());
        System.out.println("Hash code List2: " + myList2.hashCode());

        System.out.println("--------------------------");

        System.out.println("Diğer indexler dolmadan ilerideki bir indexe kayıt açma denemesi:");

        //myList3.add(15, 90);

        System.out.println("--------------------------");

        myList3.add(3, 999);
        System.out.println("List3 son hali: " + myList3);

        System.out.println("--------------------------");

        myList3.remove(2);
        System.out.println("List3 son hali: " + myList3);

        myList3.clear();

        System.out.println("--------------------------");
        System.out.println("List3 son hali: " + myList3);

    }
}
