package ders02_dataTürleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

       // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen dikdörtgenin iki kenarını giriniz" +
                "\niki kenar uzunluğu arasında enter a basın");

double kenar1=scan.nextDouble();
double kenar2=scan.nextDouble();

        System.out.println("dikdörtgenin alanı: "+ (kenar1*kenar2));


    }
}
