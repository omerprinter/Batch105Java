package ders43_collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {
    public static void main(String[] args) {

        Set<Integer> sayilar=new HashSet<>();

        sayilar.add(12);
        sayilar.add(15);

       Set<Integer> siraliSet=new TreeSet<>();

       siraliSet.add(23);
       siraliSet.add(34);
       siraliSet.addAll(sayilar);

        System.out.println(siraliSet); // [12, 15, 23, 34]  dogal sirali siralar

        // bir hashset ve bir treeset olusturalim
        // ikisine de randim 1000 tane sayi ekleyip
        // islem surelerini kiyaslayalim.

        Random rnd=new Random();
        int sayi;

        LocalTime hasBas=LocalTime.now();

        for (int i = 0; i < 1000; i++) {
            sayi= rnd.nextInt(10000);
            sayilar.add(sayi);
        }
        LocalTime hasBit=LocalTime.now();

        LocalTime treeBas=LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            sayi= rnd.nextInt(10000);
            siraliSet.add(sayi);
        }
        LocalTime treeBit=LocalTime.now();

        System.out.println("hasBas : "+hasBas+" --hasBit : "+hasBit);
        System.out.println("treeBas : "+treeBas+" --treeBit : "+treeBit);

        System.out.println("hash suresi : "+(hasBit.getNano()-hasBas.getNano()));   // daha kisa
        System.out.println("tree suresi : "+(treeBit.getNano()-treeBas.getNano())); // daha uzun



    }
}
