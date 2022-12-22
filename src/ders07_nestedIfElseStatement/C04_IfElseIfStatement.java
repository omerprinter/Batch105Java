package ders07_nestedIfElseStatement;

import java.util.Scanner;

public class C04_IfElseIfStatement {
    public static void main(String[] args) {
        // Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
// Erkek 65 yas ve uzeri emekli olabilir.
// Cinsiyet ve yasini dikkate alarak
// "Emekli olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.

        // ana değişken yaş olsun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        double yas=scan.nextDouble();

        System.out.println("Lütfen cinsiyeti giriniz E/K");
        char cınsıyet=scan.next().charAt(0);

        if (yas<15){
            System.out.println("hatalı yas girişi");
        } else if (yas<60) {
            System.out.println("emekli olamazsın");
            if (cınsıyet=='k'||cınsıyet=='K'){
                System.out.println("daha "+(60-yas)+" yıl çalışmalısın");
            } else if (cınsıyet=='e'||cınsıyet=='E') {
                System.out.println("daha "+(65-yas)+" yıl çalışmalısın");
            }else {
                System.out.println("hatalı cinsiyet girişi");
            }

        } else if (yas<65) {
            if (cınsıyet=='k'||cınsıyet=='K'){
                System.out.println("emekli olabilirsin");
            } else if (cınsıyet=='e'||cınsıyet=='E') {
                System.out.println("daha "+ (65-yas)+ " yıl çalışmalısın");
            }else {
                System.out.println("hatalı cinsiyet girişi");
            }
        }else {
            System.out.println("emekli olabilirsin");
        }


    }
}
