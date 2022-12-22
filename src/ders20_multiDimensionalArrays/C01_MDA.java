package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {


        int[][] arr = {{4,3,1},{1,2},{5,6,7},{},{3,6,8,0}};

        System.out.println(arr.length); // 5

        System.out.println(arr[2].length); // 3 ==> [5,6,7]

        System.out.println(arr[1]); // direk yazdırmaz.referansını yazdırır  [I@19dfb72a
        System.out.println(Arrays.toString(arr[1]));  //  [1, 2]

        // hepsini yazdırma
        System.out.println(Arrays.deepToString(arr)); // [[4, 3, 1], [1, 2], [5, 6, 7], [], [3, 6, 8, 0]]

        //  System.out.println(arr[3][0]); // ArrayIndexOutOfBoundsException

    }
}
