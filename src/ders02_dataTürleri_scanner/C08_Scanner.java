package ders02_dataTürleri_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        // (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen birinci tam sayıyı giriniz :");
        int sayı1=scan.nextInt(); // 20

        System.out.println("lütfen tam sayıyı giriniz :");
        int sayı2=scan.nextInt(); // 30

        System.out.println("ilk durumda sayı1 :"+ sayı1+"\nsayı2 : "+sayı2);

       int sayı3;
       sayı3=sayı1+sayı2; // ssayı3 ==> 50
       sayı1=sayı3-sayı1;
       sayı2=sayı3-sayı2;
       System.out.println("swaptan sonra sayı1 : "+sayı1+"\nsayı2 : "+sayı2+" olmuştur.");

int bos;
bos=sayı2;

sayı2=sayı1;
sayı1=bos;
        System.out.println("swaptan sonra sayı1 : "+sayı1+"\nsayı2 : "+sayı2+" olmuştur.");



    }
}
