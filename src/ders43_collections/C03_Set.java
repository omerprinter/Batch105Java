package ders43_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {

        // verilen bir arrayin tekrar eden elementlerini silip
        // her elementin 1 kez kullanildigi hale getirin.


        int[] arr={4,2,5,6,3,8,0,7,8,5,2,0,4,0,9,0,9,3,};

        Set<Integer> geciciSet=new HashSet<>();

        for (Integer each:arr) {
            geciciSet.add(each);
        }
       arr=new int[geciciSet.size()];  //  eski arr  ye yeni boyut kazandirdik.

        // set 'teki benzersiz hale getirilen elemntleri gecici array'e tasiyalim

        int index=0;
        for (Integer each :geciciSet) {
           arr[index]=each;
            index++;
        }
        // tekrarsiz degerleri gecici arr'e tasidik. simdi kendi aray'imize bu


        System.out.println(Arrays.toString(arr));

    }
}
