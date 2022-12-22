package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;


public class C02_TopluElemanEkleme {
    public static void main(String[] args) {

        List<String> harfler= new ArrayList<>();

        // tum sesli harfleri listeye ekleyin
        // eklenecek tüm array leri bir array olarak yazıp sonra for loop ile listeye ekleyebiliriz

        String [] arr={"a","e","i","o","u"};

        for (int i = 0; i < arr.length; i++) {
            harfler.add(arr[i]);  //  arr i yi harfler listine ekleme

        }

        System.out.println(harfler);
        System.out.println(harfler.size()); //  5 element var. length yeerine
        System.out.println(harfler.isEmpty());  //  list bos mu==>>  false




    }
}
