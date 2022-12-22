package ders08_ternary_Switch;

import java.util.Scanner;

public class C09_switchCase {
    public static void main(String[] args) {
        // kullanıcıdan ISTQB anlamını öğrenmek istediği harfi alın anlamını yazdırın
        // I :International  - S :Software - T :Testing - Q : Qualitifications - B : Board.

        Scanner scan=new Scanner(System.in);
        System.out.println("\"ISTQB\" kısaltmasından anlamını öğrenmek istediğiniz harfi yazınız ");
        char ch=scan.next().charAt(0);

        switch (ch){
            case 'I':
                System.out.println("I : International");
                break;
            case 'S':
                System.out.println("S : Software");
                break;
            case 'T':
                System.out.println("T :Testing");
                break;
            case 'Q':
                System.out.println("Q : Qualitifications");
                break;
            case 'B':
                System.out.println("B : Board");
                break;
            default:
                System.out.println("geçersiz giriş");

        }

    }
}
