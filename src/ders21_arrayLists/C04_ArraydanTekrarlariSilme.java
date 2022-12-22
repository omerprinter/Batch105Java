package ders21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydanTekrarlariSilme {
    public static void main(String[] args) {

        // verilen bir array deki tekrar eden sayilari tek bir kere yazacak array i duzenleyin

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};
        // bu soruyu array le yapmak cok zor.
        // Bu array in elementlerini tek tek inceleyip tekrarsız olanları liste atalım.
        List<Integer> tekrarsizListe=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizListe.contains(arr[i])){
                tekrarsizListe.add(arr[i]);
            }


        }

        System.out.println("tekrarsiz liste : "+tekrarsizListe); //  tekrarsiz liste : [1, 2, 4, 3, 5]

        // En son o Listteki elementleri iceren bir array olusturup
        // yeni array i eski array e deger olarak atayalim.

        arr=new int[tekrarsizListe.size()]; //

        for (int i = 0; i < arr.length; i++) {
            arr[i] = tekrarsizListe.get(i);  // istenen indexteki elem
            // array istenen hale geldi
            System.out.println("array in tekrarsiz hali : " + Arrays.toString(arr)); // array in tekrarsiz hali : [1, 2, 4, 3, 5]
        }
    }
}
