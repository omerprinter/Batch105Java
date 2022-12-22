package ders19_arrayss;

import ders18_arrays.C03_ArrayElementleriniArttırma;

import ders18_arrays.C04_ArrayElementleriToplama;
import ders18_arrays.C05_ArraydeElemanArama;
import ders18_arrays.C06_KullanıcıyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlarıKullanma {
    public static void main(String[] args) {

        // verilen birr int array ın elementlerini 2 arttırın

        int[] arr={2,3,4};
        arr=C03_ArrayElementleriniArttırma.elementleri2Artır(arr);
        System.out.println(Arrays.toString(arr));

        // arr array ının elementlerini toplayıp yazdırın
        System.out.println(C04_ArrayElementleriToplama.pozitifElementleriTopla(arr));


        // arr array ınde 10 element olarak var mı?
        C05_ArraydeElemanArama.elemanAra(arr,10);
        // kullanıcıdan deger alarak bir array olusturun
int [] yeniArr= C06_KullanıcıyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(arr));

    }
}
