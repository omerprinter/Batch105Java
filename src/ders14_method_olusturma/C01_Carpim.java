package ders14_method_olusturma;

import java.util.Scanner;

public class C01_Carpim {

    // main method içerisinde kullanıcıdan iki sayı alın
    // bu iki sayıyı parametre olarak kabul edip carpimlarini bize donduren bir method olusturun
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        double sayi1=scan.nextDouble(); // 5
        double sayi2=scan.nextDouble();  // 3

        System.out.println(carpimMethodu(sayi1,sayi2)); // direk 15.0 yazdıracak

        double carpimSonucu=carpimMethodu(6,2); // sonucu 12.0 yapacak yazdırmayacak

    }

    public static double carpimMethodu(double sayi1, double sayi2){
        System.out.println("carpim methodu çalıstı");
        return sayi1*sayi2;
    }

}
