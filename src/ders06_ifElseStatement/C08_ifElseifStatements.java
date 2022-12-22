package ders06_ifElseStatement;

import java.util.Scanner;

public class C08_ifElseifStatements {
    public static void main(String[] args) {
        //  Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // kenar uzunlukları 0 veya negatif ise geçersiz yazın
        //          ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenarlarını giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();

if (kenar1<=0||kenar2<=0||kenar3<=0){
    System.out.println("Geçersiz kenar uzunluğu");
} else if (kenar1==kenar2&&kenar2==kenar3) {
    System.out.println("eşkenar üçgen");

}else {
    System.out.println("eşkenar değil");
}

    }
}
