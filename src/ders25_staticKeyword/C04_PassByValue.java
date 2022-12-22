package ders25_staticKeyword;

public class C04_PassByValue {
    public static void main(String[] args) {

        double fiyat=100;

        System.out.println(indirimYygula(fiyat)); // 90
        System.out.println(indirimYygula(fiyat)); // 90
        System.out.println(indirimYygula(fiyat)); // 90

        System.out.println(fiyat); // 100


    }

    private static double indirimYygula(double fiyat) {


        fiyat=fiyat*0.9; // fiyata atama yaptık kalıcı 90 oldu

        return fiyat;


    }
}
