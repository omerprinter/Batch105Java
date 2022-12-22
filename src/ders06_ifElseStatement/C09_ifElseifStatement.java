package ders06_ifElseStatement;

import java.util.Scanner;

public class C09_ifElseifStatement {
    public static void main(String[] args) {
        // kullanıcıdan bir tam sayı alın
        // sayı negatifse "geçersiz sayı"
        // tek basamaklı ise "rakam"
        // iki basamaklı ise " iki basamaklı sayı"
        // bunun dışındakiler için "büyük sayı" yazdırsın.

        int sayı=-20;
        if (sayı<0){
            System.out.println("Geçersiz sayı");
        } else if (sayı<10) {
            System.out.println("Rakam");
            
        } else if (sayı<100) {
            System.out.println("İki basamaklı sayı");

        }else {
            System.out.println("Büyük sayı");
        }


    }
}
