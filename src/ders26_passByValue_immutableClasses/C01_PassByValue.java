package ders26_passByValue_immutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {

        double fiyat=300;

        System.out.println(indirimYygula(fiyat)); // 90
        System.out.println(indirimYygula(fiyat)); // 90
        System.out.println(indirimYygula(fiyat)); // 90

        System.out.println(fiyat); // 100

        fiyat=indirimYygula(fiyat);

        System.out.println("indirim uygulanan yeni fiyat : "+fiyat); // indirim uygulanan yeni fiyat : 270.0
    }
/*
kodlarımız anlasılır olması icin main method dan diger method lara parametre olarak gonderirken
 variable isminin aynı olmasını TERCİH EDERİZ

 java methodlar arası pass ederken variableyi degil value sini pass eder.

 bu javanın Pass By Value yu tercih etmesinden kaynaklanır

 method icindeki degisikligin kalıcı olmasını istersek
 main method icinde   fiyat=indirimYygula(fiyat); gibi atama yapabiliriz
 */


    public static double indirimYygula(double fiyat) {


        fiyat=fiyat*0.9; // fiyata atama yaptık kalıcı 90 oldu

        return fiyat;


    }
}
