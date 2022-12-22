package ders08_ternary_Switch;

import java.util.Scanner;

public class C08_SwitchCase {
    public static void main(String[] args) {
        //Kullanicidan ay numarasini alip mevsimi yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("1-12 arası bir ay numarası girin");
        int sayı=scan.nextInt();

        switch (sayı){

            case 12:
            case 1:
            case 2:
                System.out.println("kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("geçersiz numara girdiniz");
        }


    }
}
