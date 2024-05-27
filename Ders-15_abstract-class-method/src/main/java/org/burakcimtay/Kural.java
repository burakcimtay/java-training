package org.burakcimtay;

public interface Kural {

    public void cipTak();
    public default void yasam(){
        System.out.println("Yaşıyor.");
    }

}
