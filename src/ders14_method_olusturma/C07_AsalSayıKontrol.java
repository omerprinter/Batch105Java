package ders14_method_olusturma;

public class C07_AsalSayıKontrol {
    /*
     Kullanicidan main method icinde pozitif bir tamsayi alin.
     Girilen sayinin asal sayi olup olmadigini kontrol edip,

     sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.
     */
    public static void main(String[] args) {

        int sayi=28;

        System.out.println(asalSayiKontrolEt(sayi));  // asal degil
        System.out.println(asalSayiKontrolEt(23));      // asal
       System.out.println(asalSayiKontrolEt(4546121));  //asal degil

    }
    public static String asalSayiKontrolEt(int sayi){
        String sonuc=""; // "asal" yazabiliriz

        for (int i = 2; i <=(sayi-1) ; i++) {
            if (sayi%i==0){
                sonuc="asal degil";
                break;
            }

        }
        if (!sonuc.equals("asal degil")){
            sonuc="asal";
        }
        return sonuc;
    }



}
