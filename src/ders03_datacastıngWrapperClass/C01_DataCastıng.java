package ders03_datacastıngWrapperClass;

public class C01_DataCastıng {
    public static void main(String[] args) {

        /*
            bazı data türleri asla birbirine cast edilmez
         */

      //  String str=20;
      //  boolean mutluMu="true";
      //  int a=true;

        double s=20;

        int sayi=15;

        long ln=sayi;

        short sh=23;
        int a=sh;

        long lng=sh;
        float fl=lng;
        /*
        ama tersini yapmak isterseniz yani büyük data türündeki değeri
        küçük data türündeki varible'a atamak isterseniz jazva kabul etmez.
         */
        double dbl=20;
      // a=dbl;  ===> normalde sığar ama prensip icabı
      // short abc=dbl;










    }
}
