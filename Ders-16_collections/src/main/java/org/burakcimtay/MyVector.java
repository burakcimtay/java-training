package org.burakcimtay;

import java.util.Objects;
import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        Vector vectorList = new Vector<>();
        vectorList.add("Burak");
        vectorList.add(null);
        vectorList.add(true);
        vectorList.add(Boolean.FALSE);
        vectorList.add(14.53);
        vectorList.add(1.23f);
        vectorList.add(10);

        System.out.println(vectorList);
        System.out.println(vectorList.size());
        System.out.println(vectorList.firstElement());
        System.out.println(vectorList.lastElement());
        System.out.println(vectorList.capacity());
        System.out.println(vectorList.isEmpty());
        System.out.println(vectorList.subList(1,3));
        System.out.println(vectorList.get(3).getClass());
    }
}
