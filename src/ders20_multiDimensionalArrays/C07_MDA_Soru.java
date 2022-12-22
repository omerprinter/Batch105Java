package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C07_MDA_Soru {
    public static void main(String[] args) {
     //   Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
     //   yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
     //   input :     int[][] arr = {{3,4,5}, {2,3,6,7}};
     //   output:                      [5, 7, 11]


        int[][] arr = {{3,4,5}, {2,3,6,7}};
// inner 2 array olacagini ama bunların uzunluklarının degisebilecegini kabul ettik

        int ortakIndexSayisi=arr[0].length<arr[1].length ? arr[0].length : arr[1].length; // kısa olanı bulduk

        int[] ortakIndexToplamlarıArr = new int[ortakIndexSayisi];

        for (int i = 0; i < ortakIndexToplamlarıArr.length; i++) {
            ortakIndexToplamlarıArr[i]=arr[0][i]+arr[1][i];


        }
        System.out.println(Arrays.toString(ortakIndexToplamlarıArr));

    }
}
