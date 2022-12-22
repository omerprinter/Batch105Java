package ders19_arrayss;

import java.util.Arrays;

public class C02_enBuyukveEnKucukElementiBulun {
    public static void main(String[] args) {

        //verilen bir int array' da
        // en kucuk ve en buyuk sayilari yazdiran bir method olusturun.

        int[] arr={3,8,1,5,2,9};

        enBuyukenKucukElementYazdir(arr);

    }
    public static void enBuyukenKucukElementYazdir(int[] arr){

        Arrays.sort(arr);  // [1,2,3,5,8,9]

        System.out.println("En buyuk element : "+arr[arr.length-1] );
        System.out.println("En kucuk element : "+arr[0]);

    }

}
