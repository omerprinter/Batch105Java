package ders15_overloading_WhileLoop;

public class C08_WhileSoruRakamlarToplamı {
    public static void main(String[] args) {
        /*
         While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
         */

    int sayi=1111145453;

    int birrlerBasamagi=0;
    int rakamlarToplami=0;

    while (sayi!=0){
        birrlerBasamagi=sayi%10;
        rakamlarToplami+=birrlerBasamagi;
        sayi/=10;

    }
        System.out.println(rakamlarToplami);

    }

}
