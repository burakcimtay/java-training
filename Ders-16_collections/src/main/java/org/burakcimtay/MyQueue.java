package org.burakcimtay;

import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Queue;
public class MyQueue {
    public static void main(String[] args) {
        Queue<String> myQueue = new ArrayBlockingQueue<>(10);

        myQueue.add("Zeki");
        myQueue.add("Cemre");
        myQueue.add("Deniz");
        myQueue.add("Akın");
        myQueue.add("Burak");

        /*myQueue.add("Zeki");
        myQueue.add("Cemre");
        myQueue.add("Deniz");
        myQueue.add("Akın");
        myQueue.add("Burak");
        myQueue.add("Ekin");*/ //Queue kapasitesini aşıyor

        System.out.println(myQueue);

        System.out.println("------------------------------------------");

        Queue<String> myQueue2 = new PriorityQueue<>(20);

        myQueue2.add("Zeki");
        myQueue2.add("Cemre");
        myQueue2.add("Deniz");
        myQueue2.add("Akın");
        myQueue2.add("Burak");

        myQueue2.add("Deniz");
        myQueue2.add("Akın");
        myQueue2.add("Burak");

        myQueue2.add("Deniz");
        myQueue2.add("Akın");
        myQueue2.add("Burak");

        myQueue2.add("Deniz");
        myQueue2.add("Akın");
        myQueue2.add("Burak");

        /*myQueue.add("Zeki");
        myQueue.add("Cemre");
        myQueue.add("Deniz");
        myQueue.add("Akın");
        myQueue.add("Burak");
        myQueue.add("Ekin");*/ //Queue kapasitesini aşıyor

        System.out.println(myQueue2);

    }
}
