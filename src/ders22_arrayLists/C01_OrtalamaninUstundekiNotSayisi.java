package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaninUstundekiNotSayisi {
    public static void main(String[] args) {


        // Ogretmenden ogrenci notlarini alip bir list olusturun
        // ogretmen 100'dden buyuk sayi girip bitirdiginde
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        List<Double> notlar=listeOlusturMethodu();

        System.out.println(notlar);

        raporla(notlar);

    }

   public static void raporla(List<Double> notlar) {
       // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

       int ogrenciSayisi=notlar.size();
       double notlarToplami=0.0;
       double sinifNotOrtalamsi=0.0;
       int ortalamaUstundekiOgrenciSayisi=0;

       // notlar toplamını bulalım
       for (int i = 0; i < notlar.size(); i++) {

           notlarToplami+=notlar.get(i);
       }
       // toplamı bulduk. Ortalama bulalım
       sinifNotOrtalamsi=notlarToplami/ogrenciSayisi;

       // ortalama ustundeki ogrenci sayisini bulalim

       for (int i = 0; i < notlar.size(); i++) {

           if (notlar.get(i)>sinifNotOrtalamsi){
               ortalamaUstundekiOgrenciSayisi++;
           }

       }
       // istenenleri yazdıralim
       System.out.println("Girilen not sayisi : "+ogrenciSayisi+
               "\nGirilen notlarin ortalamasi: "+sinifNotOrtalamsi+
               "\nOrtalama ustunde not alan ogrenci sayisi : "+ortalamaUstundekiOgrenciSayisi);

    }

    public static List<Double> listeOlusturMethodu(){

        List<Double> notlar=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        Double girilenNot=5.0;

        while (girilenNot<=100){

            System.out.println("Lutfen listeye eklemek icin not giriniz:"+
                    "\nBitirmek icin 100'den buyuk sayi yazin");
            girilenNot=scan.nextDouble();

            if (girilenNot<=100){
                notlar.add(girilenNot);
            }

        }

        return notlar;
    }
}
