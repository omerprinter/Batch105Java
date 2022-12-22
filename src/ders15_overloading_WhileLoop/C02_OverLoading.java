package ders15_overloading_WhileLoop;

public class C02_OverLoading {
    public static void main(String[] args) {

carpim(3,5);   //  method call sirasinda method parantesine yazilanlara argument denir.
carpim(3.4,2);

    }
// Bir class te aynı isim ve aynı signature a sahip iki metod olmaz.
    /*
    hangi method un calısacagına soyle karar verir:
    1- once method ismine bakar
    2- argument sayısı ile parametre sayisina bakar
    3- argument ve parametre uyumuna bakar
    4- minimum casting
     */

    public static void carpim(int sayi1,int sayi2){         // carpim int int
        System.out.println("iki int sayının carpimi : "+sayi1*sayi2);

    }
    public static void carpim(int sayi1,int sayi2,int sayi3){    // carpim int int int
        System.out.println("uc int sayının carpimi : "+sayi1*sayi2*sayi3);

    }
    public static void carpim(double sayi1,int sayi2){         // carpim double int
        System.out.println("double- int sayının carpimi : "+sayi1*sayi2);

    }
    public static void carpim(int sayi1,double sayi2){         // carpim int double
        System.out.println("int-double  sayının carpimi : "+sayi1*sayi2);

    }
    public static void carpim(double sayi1,double sayi2){         // carpim double-double
        System.out.println("iki double sayının carpimi : "+sayi1*sayi2);

    }
}
