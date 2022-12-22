package ders19_arrayss;

import java.util.Arrays;

public class C07_ArrayaYeniElementEkleme {

    public static void main(String[] args) {

        int[]arr={2,4,6};

        // bu arr'a 4. bir element olarak 8 ekleyelim.
        /*
        var olan bir arraya yeni eleman eklenemez
        ama yeni deger atanabilir

        once int[] arr2=[2,4,6,8] seklinde yeni bir array olusturup
        sonra arr2 degerini arr'ye atayabilirim.
         */

        // yeni array olusturalım
        // arr2  ye konulacak dataların turu.
        // eski array ın 1 fazlası olcak.

        int[] arr2 = new int[arr.length+1];  //   [0, 0, 0, 0, ]

        for (int i = 0; i < arr.length; i++) {

            arr2[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));  //  [2, 4, 6, 0]
        arr2[arr2.length-1]=8;
        System.out.println(Arrays.toString(arr2)); //  [2, 4, 6, 8]
        // arr yi arr2 ye atayıp bitirelim
        arr=arr2;
        System.out.println(Arrays.toString(arr));  //  [2, 4, 6, 8]
    }
}
