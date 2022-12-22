package ders03_datacastıngWrapperClass;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi=20;
        /*
        Geniş data türündeki değeri dar data türündeki bir variable a atamak isterseniz
         Java sorumluluğu almanızı ister.

         bu sorumluluğu almak için cast edeceğimiz değerin önüne () içinde short yazılır.

         */
        short sh=(short) sayi;
        System.out.println(sh);

        double dbl=23.5;

        int say=(int) dbl;
        System.out.println(say); // 23

        say=256;
        byte byt=(byte) say;
        System.out.println(byt);


    }
}
