package ders04_matematikselislemler_incrementdescrement;

import java.util.Scanner;

public class C04_RakamlarToplamı {
    public static void main(String[] args) {

        // kullanıcıdan 4 basamaklı sayı alıp rakamlar toplamını bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı sayı giriniz");

        int sayı=scan.nextInt();

        int birlerbas=sayı%10;
        sayı=sayı/10;

        int onlarbas=sayı%10;
        sayı=sayı/10;

        int yuzlerbas=sayı%10;
        sayı=sayı/10;

        int bınlerbas=sayı%10;
        sayı=sayı/10;

        int rakamlarTop=birlerbas+onlarbas+yuzlerbas+bınlerbas;

        System.out.println("Girilen sayının rakamlar toplamı : "+rakamlarTop);


    }
}
