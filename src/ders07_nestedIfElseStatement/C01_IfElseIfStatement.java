package ders07_nestedIfElseStatement;

import java.util.Scanner;

public class C01_IfElseIfStatement {
    public static void main(String[] args) {
        //kullanıcının kilo(kg) ve boyunu(cm) isteyip vücut kitle endeksini hesaplayın
        // (kilo*10000/(boy*boy))
        // vke 30 dan büyükse obez, 25-30 arası ise kilolu, 20-25 arası normal, 20 den küçük zayıf yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu \"kg\" olarak giriniz : ");
        double kılo=scan.nextDouble();
        System.out.println("Lütfen boyunuzu \"cm\" olarak giriniz :");
        double boy=scan.nextDouble();
        double vke=kılo*10000/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz : "+vke);

        if (vke>30){
            System.out.println("OBEZ");
        } else if (vke>25) {
            System.out.println("KİLOLU");

        } else if (vke>20) {
            System.out.println("NORMAL");

        }else if (vke>0){
            System.out.println("ZAYIF");
        }else {
            System.out.println("geçersiz giriş yaptınız");
        }


    }
}
