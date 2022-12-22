package ders05_concatenation_Operators;

import java.util.Scanner;

public class C03_If_Statements {
    public static void main(String[] args) {

        // kullanıcıdan iki sayı alın
        // eğer 1. sayı 100 den büyükse "ilk sayı 100 den büyük" yazın
        //eğer ikinci sayı çift ise "ikinci sayı çift yazdırın"
        //eğer ilk sayı 2. ssayıdan büyük ise "ilk sayı 2. sayıdan büyük" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki tam sayı giriniz :");
        int s1=scan.nextInt();
        int s2=scan.nextInt();

        if(s1>100){
            System.out.println("İlk sayı 100 den büyük");
        }

        if (s2%2==0){
            System.out.println("İkinci sayı çifttir.");
        }

        if(s1>s2){
            System.out.println("ilk sayı daha büyük");
        }

    }
}
