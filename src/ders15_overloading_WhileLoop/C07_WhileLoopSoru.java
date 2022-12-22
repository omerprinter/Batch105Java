package ders15_overloading_WhileLoop;

public class C07_WhileLoopSoru {
    public static void main(String[] args) {
        /*
         Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
         While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.
         */

            int sayi=3;
            int us=4;

        ushesapla(sayi,us);


    }

    public static void ushesapla(int sayi,int us){

        int sonuc=1;

        while (us>0){
            sonuc*=sayi;
            us--;
        }
        System.out.println(sonuc);

    }

}
