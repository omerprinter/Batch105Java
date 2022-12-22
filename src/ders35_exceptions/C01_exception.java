package ders35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exception {
    public static void main(String[] args) {

        //kullanicidan bir tam sayi isteyin
        //ve o sayiinin karesini yazdirin
        // kullanici ondalikli girerse kullaniciya uyari yazisi yazip
        //tekrar sayi isteyen bir method olusturun

sayiAlKaresiniYazdir();


    }
    public static void sayiAlKaresiniYazdir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");



        try {
           int girilenSayi = scan.nextInt();
           /*
           eger ondalikli sayi girilirse 25.satir exception verecek ve
            catch bloguna kadar olan diger kodlar calismayacak.
            catch blogu hata yakalandiginda ne yapmasini istedigimiz bolumdur.

            bu soruda istenen exception olustugunda yeniden deger istenmesi
            biz de exception olustugunda yeniden blogu calistirdik.

            hata olmazsa catch blogu devreye girmez ve kod normal sekilde calisir biter.
            */
            System.out.print("girdigininz sayinin karesi : ");
            System.out.println(girilenSayi*girilenSayi);

        } catch (InputMismatchException e) {
            System.out.println("sana tam sayi degeri gir dedik :");
            sayiAlKaresiniYazdir();

        }


    }
}
