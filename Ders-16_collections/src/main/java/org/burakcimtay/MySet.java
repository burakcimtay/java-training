package org.burakcimtay;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
    public static void main(String[] args) {
        Set<String> studentList1 = new HashSet<>();
        HashSet<String> studentList2 = new HashSet<>();

        Set<String> studentList3 = new TreeSet<>();
        TreeSet<String> studentList4 = new TreeSet<>();

        Set<String> studentList5 = new LinkedHashSet<>();
        LinkedHashSet<String> studentList6 = new LinkedHashSet<>();

        studentList1.add("Zeki");
        studentList1.add("Cemre");
        studentList1.add("Deniz");
        studentList1.add("Akın");
        studentList1.add("Burak");
        studentList1.add(null);

        System.out.println("HashSet: " + studentList1);

        studentList3.add("Zeki");
        studentList3.add("Cemre");
        studentList3.add("Deniz");
        studentList3.add("Akın");
        studentList3.add("Özer");
        studentList3.add("Burak");
        studentList3.add("Burak");
        studentList3.add("Burak");
        //studentList3.add(null); TreeSet null değer almaz

        System.out.println("TreeSet: " + studentList3); // TreeSet sıralama yapar

        studentList6.add("Zeki");
        studentList6.add("Cemre");
        studentList6.add("Deniz");
        studentList6.add("Akın");
        studentList6.add("Burak");
        studentList6.add(null);

        System.out.println("LinkedHashSet: " + studentList6);

    }
}
