package ders19_arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanıcıdanDegerAlarakArrayOlusturma {
    public static void main(String[] args) {
        // kullanıcıdan istedigi kadar sayi alip bir array olusturun
        // kullanıcı eleman girisini bitirmek icin 0 a bassın

        Scanner scan=new Scanner(System.in);
        int[]arr={0};
        int girilenSayi=0;


        do {

            System.out.println("array'a eklemek icin bir tam sayi giriniz"+
                    "\nBitirmek icin 0'a basin");
            girilenSayi=scan.nextInt();

            if (arr[0]==0 ){
                arr[0]=girilenSayi;
            }else if (girilenSayi!=0){
                arr=C08_ArrayeElemanEklemeMethodu.arrayeElemanEkle(arr,girilenSayi);
            }



        }while (girilenSayi!=0);

        System.out.println(Arrays.toString(arr));
    }
}
