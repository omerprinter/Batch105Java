package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_set {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        // list.set(index,yeniDeger) methodu
        // istenen index teki eski degeri silip bize dondurur
        // ve o index teki degeri verdigimiz yeni deger olarak atar.

        List<Integer> sayilar= new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);
        }

        // Java da set() u update icin kullanılır
        // add() ile set() farklidir.

        System.out.println(sayilar.set(0, 8));
        int eskiDeger=sayilar.set(1,9);
        System.out.println(eskiDeger);
        System.out.println(sayilar);




    }
}
