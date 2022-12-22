package ders15_overloading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan toplanmak uzere sayi alin
        sayıların toplamı 500e eşit olur veya gecerse

       girilen sayi adedi girilen sayilarin toplamını yazdirin

       "bu kadar yeter" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        double girilenSayi=0;

        int sayac=0;
        double toplam=0;

        while (toplam<500){
            System.out.println("Toplamak icin sayi giriniz:");
            girilenSayi=scan.nextDouble();

            toplam +=girilenSayi;
            sayac++;

        }
        System.out.println("Girilen "+sayac+" sayinin toplami :"+toplam+" oldu. Bu kadar yeter");
    }
}
