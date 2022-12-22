package ders35_exceptions;

import java.util.Scanner;

public class C03_ArrayIndexOutOfBoundsExeption {
    public static void main(String[] args) {
        // Kullanicidan bir index isteyin
        // verilen bir array dan kullanicin girdigi index'teki elemnti yazdirin

        int[] arr={2,3,5,4,5,2,8,7,6,1,9,4};

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir index giriniz");
        int index=scan.nextInt();

        try {

            System.out.println(arr[index]);

        } catch (ArrayIndexOutOfBoundsException hata) {

        //    System.out.println(hata.getMessage()); //Index 56 out of bounds for length 12
        //    hata.printStackTrace();
//java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 12
//	at ders35_exceptions.C03_ArrayIndexOutOfBoundsExeption.main(C03_ArrayIndexOutOfBoundsExeption.java:18)
            //javanin yazdigi tum hata mesajini verir. ama kodlar calismaya devam eder

            // catch blogunda hicbi kod olmasa da calismaya devam eder.
            // catch blogunda kullaniciya yazdiracagim mesaj kod yazanin inisiyatifindedir.
        }

    }
}
