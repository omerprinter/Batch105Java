package ders19_arrayss;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {

        int[] arr={1,8,9,3,7,2,5,8,1};

        // dizinin ortasından saga sola dogru aradıgında herzaman dogru sonuc vermez

        System.out.println(Arrays.binarySearch(arr,8)); //  7. index te 8 var==>>
        System.out.println(Arrays.binarySearch(arr,5)); //  -2 dedi.??
        System.out.println(Arrays.binarySearch(arr,1)); //   0. index te 1var.
        System.out.println(Arrays.binarySearch(arr,9)); //   -10 dedi.
/*
binarySearch methodunun dogru sonuclar verebilmesi icin oncelikle sort methodu kullanılmalidir.

sort() kullanmadan binarySearch()  ile yapilan aramanin sonucu belli olmaz.
dogru da yanlıs da sonuc verebilir.
 */

     Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[1, 1, 2, 3, 5, 7, 8, 8, 9]

        System.out.println(Arrays.binarySearch(arr,8)); //  6. index te
        System.out.println(Arrays.binarySearch(arr,5)); //  4. index te
        System.out.println(Arrays.binarySearch(arr,1)); //  1. index te
        System.out.println(Arrays.binarySearch(arr,9)); //  8. index te

        // array da olmayan bir eleman aratırsak
        // java once o sayının nerede olabilecegini bulur
        // sonra bu SİRAyi - isareti ile verir.

        System.out.println(Arrays.binarySearch(arr,-3)); //   -1
        System.out.println(Arrays.binarySearch(arr,4)); //     -5
        System.out.println(Arrays.binarySearch(arr,10)); //    -10
        System.out.println(Arrays.binarySearch(arr,100)); //   -10
    }
}
