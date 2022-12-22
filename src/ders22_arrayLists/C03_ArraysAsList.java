package ders22_arrayLists;

import java.util.Arrays;
import java.util.List;

public class C03_ArraysAsList {
    public static void main(String[] args) {

        Integer[] arr={1,2,3,};
        // verilen array'i liste cevirmek icin
        // bir list olusturup for loop ile tasimayi tavsiye ediyoruz

        List<Integer> arraydanList= Arrays.asList(arr);

        System.out.println(arraydanList);

        // bu yontemin 2 negatif yonu vardır
        // 1 - list'ler esnek uzunluga sahip degildirler.
             // add,remove gibi ozellikleri kullanmak istersek .
            // arraydanList.add(10); UnsupportedOperationException hatasi
            // arraydanList.remove(1);  UnsupportedOperationException

        //2 - Bu yontem kaynak olan array ile yeni olusturulan List'i birbirine baglar
        // birinde yaptıgınız degisiklik digerine yansır.

        System.out.println("Array : "+ Arrays.toString(arr));
        System.out.println("Liste : "+arraydanList);

        // sadece array in bir elemanini degistirelim
        arr[0]=10;

        System.out.println("Array i degistirince  : "+ Arrays.toString(arr));
        System.out.println("Liste degistirince: "+arraydanList);

    }
}
