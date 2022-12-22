package ders08_ternary_Switch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        // kullanıcadan bir sayı alın
        // sayı pozitif ise iki katını yazdırın
        // sayı negatif ise sayıya 10 ekleyip yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz :");

        double sayı=scan.nextDouble();

        if (sayı>0){
            System.out.println(sayı*2);
        }else {
            System.out.println(sayı+10);
        }

        System.out.println(sayı>0 ? 2*sayı : sayı+10);

    }
}
