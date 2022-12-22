package ders04_matematikselislemler_incrementdescrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        // kullanıcıdan iki integer değer alıp bunları birbirine bölün ve sonucu double olarak yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki tamsayı giriniz :");

int sayı1=scan.nextInt();
int sayı2=scan.nextInt();

        System.out.println(sayı1/sayı2);

double bolum= (double)(sayı1/sayı2);
        System.out.println(bolum);

        double dogrubolum=(double)sayı1/(double) sayı2;

        System.out.println(dogrubolum);


    }
}
