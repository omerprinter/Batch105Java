package ders33_inheritanceDataTypeKullanimi_overriding;

public class FAvcikuslar extends EKuslar{

    public void hareket( ){

        System.out.println("Avci kuslar ucarlar");
    }

    public void beslenme( ){

        System.out.println("Avci kuslar et yerler");
    }

    public void pence( )  {
        System.out.println("Avci kuslar pencelidir");
    }

    public void gaga( ) {

        System.out.println(" sivri gagali");
    }

    public static void main(String[] args) {

        FAvcikuslar avci1=new FAvcikuslar();
        /*
        bir obje olusturulurken
        constructor ve data turu ayni class ta ise
        mevcut class ta varsa alir yoksa yukari dogru parentlere cikarak bakar
         */

        avci1.beslenme(); // Avci kuslar
        avci1.gaga();     // Avci kuslar
        avci1.pence();    // Avci kuslar
        avci1.hareket();  // Avci kuslar
        avci1.cogalma();  // Kuslar
        avci1.kanat();    // Kuslar
        avci1.omur();     // Hayvanlar
        avci1.solunum();  // Kuslar


        EKuslar avci2=new FAvcikuslar();
/*
Bir obje olusturulurken data turu ve constructor farkli ise
hangi methodun gecerli olacagini bulmak icin

once data turunun oldugu class ve parentlarina bakarak o method'u buluruz.
bulamazsak CTE verir.

bulursak HEMEN CALISTIRMAYIZ
once o method override edilip edilmedigini kontrol ederiz.
override edilmisse onu kullaniriz.
 */
        avci2.beslenme(); // Avci kuslar
        avci2.gaga();     // Avci kuslar
        //avci2.pence();    CTE
        avci2.hareket();  // Avci kuslar
        avci2.cogalma();  // Kuslar
        avci2.kanat();    // Kuslar
        avci2.omur();     // Hayvanlar
        avci2.solunum();  // Kuslar


        DHayvanlar avci3=new FAvcikuslar();

        avci3.beslenme(); // Avci kuslar
        //avci3.gaga();    CTE
        //avci3.pence();   CTE
        avci3.hareket();  //  Avci kuslar
        avci3.cogalma();  //  Kuslar
        //avci3.kanat();   CTE
        avci3.omur();     // Hayvanlar
        avci3.solunum();  // Kuslar


        EKuslar kus1=new EKuslar();
        kus1.cogalma(); // Kuslar
        kus1.gaga();    // Kuslar
        kus1.kanat();   // Kuslar
        kus1.hareket(); // Hayvanlar
        kus1.solunum(); // Kuslar
        kus1.beslenme(); // Hayvanlar
        kus1.omur();    // Hayvanlar


        DHayvanlar kus2=new EKuslar();
        kus2.cogalma(); // Kuslar
        //kus2.gaga();  CTE
        //kus2.kanat(); CTE
        kus2.hareket(); // Hayvanlar
        kus2.solunum(); // Kuslar
        kus2.beslenme(); // Hayvanlar
        kus2.omur();    // Hayvanlar

    }
}
