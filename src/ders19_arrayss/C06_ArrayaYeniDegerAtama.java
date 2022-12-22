package ders19_arrayss;

import java.util.Arrays;

public class C06_ArrayaYeniDegerAtama {

    public static void main(String[] args) {

    String str="java";

    str="hava";



        /*
        var olan bir array ın uzunlugu degistirilemez.
        Ama var olan bir array a yeni bir array degeri atanabilir.

         */

       // 1==> var olan bir array i yeni deger olarak atayabiliriz.
        String[] arr1={"Ali","Veli"};
        String[] arr2={"A","B","C"};

        arr1=arr2;

        System.out.println(Arrays.toString(arr1)); //  [A, B, C]

        // 2==> istediginiz uzunlukta bos bir array degeri atayabiliriz

        arr1=new String[6];
        System.out.println(Arrays.toString(arr1)); //  [null, null, null, null, null, null]

        // 3==> yeni olusturulan array a { } icinde deger yazarak atama yapabiliriz.
        // Ancak var olan bir arraya yeni deger ataması icin {} KULLANILMAZ.

        //  arr1={"g","h"};  olmazzzzzz

    }
}
