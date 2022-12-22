package ders03_datacastıngWrapperClass;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {
        // kullanıcıdan bir tamsayı alı
        // kaç girilirse girilsin konsolda -128 ile 127 arasını yazdıracak kod yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz :");
        int girilenSayı=scan.nextInt();
        byte donusensayı=(byte) girilenSayı;
        System.out.println("Girdiğiniz "+girilenSayı+" nin dönüşmüş hali : "+donusensayı);

    }
}
