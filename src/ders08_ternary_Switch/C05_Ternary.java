package ders08_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {

      //  Kullanicidan bir tamsayi alin.
      //  Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
      //  Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

        int sayı=2220;


       if (sayı>0){

           System.out.println(sayı%2==0 ? "çift sayı" : "çift sayı değil");

       }else {

           System.out.println(sayı<-99&&sayı>-1000 ? "üç basamaklı" : "üç basamaklı değil");

       }

String sonuc=sayı>0? sayı%2==0 ? "çift sayı" : "çift sayı değil":sayı<-99&&sayı>-1000 ? "üç basamaklı" : "üç basamaklı değil";
        System.out.println(sonuc);

    }
}
