package ders02_dataTürleri_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //  Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir ondalıklı sayı giriniz : ");
        double sayı1=scan.nextDouble();

        System.out.println("Bir tamsayı giriniz :");
        int sayi2=scan.nextInt();

        System.out.println("Girdiğiniz sayıların toplamı = "+(sayı1+sayi2));
        System.out.println("Girdiğiniz sayıların çarpımı = "+(sayı1*sayi2));


    }
}
