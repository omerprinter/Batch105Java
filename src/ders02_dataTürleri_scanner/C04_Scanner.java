package ders02_dataTürleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan ismini alıp büyük harflerle yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz : ");
        String kullanıcıAdı=scan.next();
        System.out.println("isminiz: "+kullanıcıAdı.toUpperCase());


        //  Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

    }
}
