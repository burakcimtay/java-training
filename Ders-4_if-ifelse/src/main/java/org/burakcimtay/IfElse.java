package org.burakcimtay;

public class IfElse {

    public static void main(String[] args) {

        System.out.println("---------------IF---------------");

        int yas = 15;

        if(yas>18){
            System.out.println("Yaşınız tutuyor.");
        }
        else {
            System.out.println("Yaşınız 18'in altında.");
        }

        System.out.println("---------------IF ELSE IF---------------");

        int puan = 65;

        if (35>=puan && puan>=0){
            System.out.println("Sınavdan kaldınız.");
        } else if (70>=puan && puan>35) {
            System.out.println("Sınavdan koşullu geçtiniz.");
        }
        else {
            System.out.println("Sınavdan başarıyla geçtiniz.");
        }
    }
}