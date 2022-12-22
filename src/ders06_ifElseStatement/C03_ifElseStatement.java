package ders06_ifElseStatement;

import java.util.Scanner;

public class C03_ifElseStatement {
    public static void main(String[] args) {
// ikizkenar üçgen yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenarlarını giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();

        if (kenar1<=0 || kenar2<=0 || kenar3<=0){
            System.out.println("geçersiz uzunluk girdiniz !!!");
        }
        else if (kenar1==kenar2&&kenar2==kenar3){
            System.out.println("eşkenar üçgen");
        } else if (kenar1==kenar2||kenar1==kenar3||kenar2==kenar3) {
            System.out.println("ikizkenar üçgen");
            
        }else {
            System.out.println("çeşitkenar üçgen");
        }


    }
}
