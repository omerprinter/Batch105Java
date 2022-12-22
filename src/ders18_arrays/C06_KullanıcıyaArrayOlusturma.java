package ders18_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullanıcıyaArrayOlusturma {
    public static void main(String[] args) {
        /*
        Kullanicidan array’in boyutunu ve elementlerini alip
         array’i olusturan ve bize donduren bir method olusturun.
         */

        int[] kullanıcıArrayi=arrayOlustur();
        System.out.println(Arrays.toString(kullanıcıArrayi));


    }
    public static int[] arrayOlustur(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lusturulacak array ın boyutunu giriniz");

        int length=scan.nextInt();

        int[] kullanıcıArrayi=new int[length];

        for (int i = 0; i < length; i++) {

            System.out.println("array a eklenecek bir sayı giriniz");
            kullanıcıArrayi[i]=scan.nextInt();

        }
  return kullanıcıArrayi;

    }

}
