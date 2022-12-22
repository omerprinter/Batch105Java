package ders12_forLoops;

public class C03_Faktoriyel {
    public static void main(String[] args) {
        // kullanıcının verdiği sayının faktöriyelini bulalım


        int sayi=10;
        int faktoriyel=1;

        for (int i = sayi; i >=1 ; i--) {
            faktoriyel=faktoriyel*i;
        }
        System.out.println(faktoriyel);


        // 1 den 100 e kadar olansayıları toplayın

        int toplam=0;
        for (int i = 1; i <=100 ; i++) {
            toplam=toplam+i;

        }
        System.out.println(toplam);
    }
}
