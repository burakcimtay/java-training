package org.burakcimtay.v3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
        int sayi1 = 0;
        int sayi2 =0;
        int toplam =0;
        float bolme =0;

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        do {
            try {
                System.out.println("Lütfen 1. sayıyı giriniz: ");
                sayi1 = scanner.nextInt();

                System.out.println("Lütfen 2. sayıyı giriniz: ");
                sayi2 = scanner.nextInt();

                toplam = sayi1 + sayi2;
                bolme = (float) sayi1 / sayi2;

                System.out.println("Toplam: " + toplam);
                System.out.println("Bolme: " + bolme);

                if (sayi2 == 0) {
                    throw new ArithmeticException("Sayı 2 0 olamaz.");
                }

                flag = false;

            } catch (ArithmeticException e){
                System.out.println("Hata: " + e);
            } catch (InputMismatchException e){
                System.out.println("Hata: " + e);
            } catch (RuntimeException e){
                System.out.println("Hata: " + e);
            } catch (Exception e){
                System.out.println("Hata: " + e);
            } finally {
                System.out.println("Program bitti.");
            }
        } while (flag);

    }
}
