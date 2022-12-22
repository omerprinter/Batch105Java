package ders18_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String [] arr={"Ali","Ulus","Nesrin"};

        // bu array ın tum elementlerini aralarında bir bosluk birakarak yazdırın

        for (int i = 0; i < arr.length; i++) {  // arr.lenght ==> 0 1 2 . index
            System.out.print(arr[i]+" "); //  Ali Ulus Nesrin
        }
        System.out.println("");
        // arrary olarak yazdırlalım
          System.out.println(arr); // array non primitive data old. java referansını yazdırır

        // Array ı array olarak yazdırmak için Arras Class ından yardım alırız

        System.out.println(Arrays.toString(arr)); //  [Ali, Ulus, Nesrin]

    }
}
