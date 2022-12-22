package ders11_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str="J1ava2 G9uzel5dir8";
        // str deki sayıları silip Java Guzeldir yazdırın
        // str.replaceAll() sadece bir harf veya char sequence'i değil
        // genelleme ile söyleyebileceğimiz ortak özellikteki karakterleri değiştirir.

        System.out.println(str.replaceAll("\\d",""));

        System.out.println(str.replaceAll("\\D",""));

        String s1="ilk ürünün fiyatı : 1250 tl";
        String s2="ikinci ürünün fiyatı : 1500 tl";

        s1=s1.replaceAll("\\D",""); //  1250
        s2=s2.replaceAll("\\D",""); //  1500

        System.out.println(s1+s2); // yanyana birleştiri---12501500
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); //  2750 -- stringi integer a çevirdik



    }
}
