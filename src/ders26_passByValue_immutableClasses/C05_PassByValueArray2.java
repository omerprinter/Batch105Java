package ders26_passByValue_immutableClasses;

import java.util.Arrays;

public class C05_PassByValueArray2 {
    public static void main(String[] args) {

        // bir method olusturun
        // sayilar array inin uzunlugundan 2 fazla olan
        // ve elementlerin tamami 5 olan yeni bir array olusturup
        // deger olarak sayilar array ine atayin ve sayilar arrayini yazdırın.


        int[] sayilar={3,4,5,6};
        arrayaYeniDegerAta(sayilar);

        System.out.println(Arrays.toString(sayilar));

    }
    public static void arrayaYeniDegerAta(int[] sayilar){

        int[] yeniArray=new int[sayilar.length+2];

        for (int i = 0; i < yeniArray.length; i++) {
            yeniArray[i]=5;

        }
        sayilar=yeniArray;
        System.out.println("method da ssayilarin son hali : "+ Arrays.toString(sayilar));

    }

}
