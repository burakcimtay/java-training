package org.burakcimtay._02_impl;

class MyBaseThread implements Runnable {

    @Override
    public void run(){
        System.out.println("MyBaseThread is started. " + Thread.currentThread().getName());
    }

}

public class AppMain {
    public static void main(String[] args) {
        MyBaseThread myBaseThread = new MyBaseThread();
        System.out.println("MyBaseThreat is started.");

        Thread thread = new Thread(myBaseThread);
        thread.start();
    }
}
