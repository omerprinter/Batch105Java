package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_ElementEkleme {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        System.out.println(sayilar);  // []

        System.out.println(sayilar.add(10)); //  true

        System.out.println(sayilar);

        sayilar.add(20);
        System.out.println(sayilar); // tersi soylenmedikce sona ekler

        sayilar.add(1,15);
        System.out.println(sayilar);
        // listenin basına 44 ekleyelim
        sayilar.add(0,44);
        System.out.println(sayilar);

        List<Integer> eklenecekListe=new ArrayList<>();
        eklenecekListe.add(3);
        eklenecekListe.add(5);

        // sayilar listesinin sonuna eklencekj listeyi ekleyin

        sayilar.addAll(eklenecekListe);
        System.out.println(sayilar);

        // sayilar listesinin basındaki 44 den sonra eklenecek listeyi ekleyin

        sayilar.addAll(1,eklenecekListe);
        System.out.println(sayilar);  // bir elementi istedigimiz kadar tekrar tekrar ekleyebiliriz


    }
}
