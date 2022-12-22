package ders15_overloading_WhileLoop;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan toplanmak uzere tam sayilar alın.
        kulanıcı 0 a basarsa sayi alma islemini bitirin

        kullanıcının kac sayi girdigini ve
        bu sayilarin toplaminin kac oldugunu yazdirin
         */

        Scanner scan=new Scanner(System.in);
       int girilenSayi=5; // verilen ilk deger bu soru icin 0 olmamalı.cunku 0  loop u bitirmek icin kullanılacak.

        int sayac=0;
        int toplam=0;

       while (girilenSayi!=0){
           System.out.println("Lutfen toplamak icin tamsayi girin"+
                   "\nBitirmek icin 0'a basin");
           girilenSayi=scan.nextInt();

           if (girilenSayi!=0){
               sayac++;
               toplam=toplam+girilenSayi;
           }
       }

        System.out.println("Girilen "+sayac+" adet sayının toplamı: "+toplam);

    }
}
