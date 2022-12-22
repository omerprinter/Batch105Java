package ders02_dataTürleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
      /* Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.

       */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz :");
        String isim=scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz : ");
String soyisim=scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz : ");
        double yas=scan.nextDouble();
        System.out.println("İsminiz : "+isim+"\nSoyisminiz : "+soyisim+"\nYaşınız : "+yas+"\nKaydınız başarıyla tamamlanmistir.");

    }
}
