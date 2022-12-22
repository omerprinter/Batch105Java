package ders16_doWhileLoop;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        // 10,11,12 sayılarını toplayan bir while loop olusturalım

        int sayi=10;
        int toplam=0;

        do {
        toplam+=sayi;
        sayi++;

        }while (sayi<=12);

        /*
        do while loop un 2 avantajı varrdır
        1- Loop body si eb az 1 kere calisir.(while loopta baslangıc degeri uygun degilse hic calışmayabilir)
        2- while bitis kontrolu loop kadar calısir.(while loop da bir kere fazladan calisir)
         */


    }
}
