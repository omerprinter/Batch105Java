package ders16_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // 10,11,12 sayılarını toplayan bir while loop olusturalım

        int sayi=10;
        int toplam=0;

        while (sayi<=12){

            toplam+=sayi;
            sayi++;

        }
        /*
        while loop ta 2 problem olusabilir
        1- once degeri kontrol edip sonra islem yapıldıgından body de tekrar kontrol gerkekbilir
        2- yapılan islem sayısından 1 fazla while biris sartı kontrol edilir
        3- while loop öncesinde degerleri kontrol edecegimiz bir variable olusturuyorsak ona yapacagimiz atamayı dıkkatli yapmalıyız
        Yanlış değer ataması yapmak bazen loop un calışmamasına neden olabilir.
         */

    }
}
