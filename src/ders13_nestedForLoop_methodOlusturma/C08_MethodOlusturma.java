package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C08_MethodOlusturma {
    public static void main(String[] args) {

        /*
        kullanıcıdan iki sayı alıp bunların toplamını yazdıran bir
        method oluşturun
         */
            isteToplaYazdir();
            isteToplaYazdir();

    }

    public static void isteToplaYazdir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println("girilen sayıların toplamı : "+ (sayi1+sayi2));
    }

}
