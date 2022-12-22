package ders08_ternary_Switch;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {

        //j : java
        // D: Development
        // k : Kit.
// kullanıcıdan bir har alın alınan harf JDK dan biri ise yukarıdaki kelimeleri yazdırın
// bu harflerden biri değil ise geçersiz harf yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz :");
    char harf=scan.next().charAt(0);

    switch (harf){

        case 'J' :
        case 'j' :
            System.out.println("Java");
            break;
        case 'D':
        case 'd':
            System.out.println("Devolepment");
            break;
        case 'K':
        case 'k':
            System.out.println("Kit");
            break;
        default:
            System.out.println("geçersiz harf");

}


    }
}
