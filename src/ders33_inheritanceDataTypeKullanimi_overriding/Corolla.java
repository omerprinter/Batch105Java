package ders33_inheritanceDataTypeKullanimi_overriding;

public class Corolla extends BToyota{

    String model="Corolla";
    String uretimYeri="Türkiye";
    int yil=2023;

    public static void main(String[] args) {
        /*
        bor obje olusturulurken data turu ve constructorayni class'ta ise
        bir VARIABLE'INdegerini bulmak icin o class a gideriz
        yoksa sirasiyla parentlere gideriz  ilk buldugumuzu aliriz.
         */

        Corolla corolla1=new Corolla();           //
        System.out.println(corolla1.model);       // Corolla class i
        System.out.println(corolla1.uretimYeri);  //   Corolla class i
        System.out.println(corolla1.yil);         //  Corolla class i
        System.out.println(corolla1.marka);       //  BToyota
        System.out.println(corolla1.motor);       //  Araba
        System.out.println(corolla1.plaka);       //  Araba
        System.out.println(corolla1.yakit);       //  BToyota

        BToyota corolla2=new Corolla();
        /*
        obje olusturulurken data turu ve constructor farkli ise
        mevcut class a ve parente bakar. geri vitez yapmaz
         */
        System.out.println(corolla2.model);       // BToyota
        //System.out.println(corolla2.uretimYeri);// CTE
        System.out.println(corolla2.yil);         // BToyota
        System.out.println(corolla2.marka);       // BToyota
        System.out.println(corolla2.motor);       // Araba
        System.out.println(corolla2.plaka);       // Araba
        System.out.println(corolla2.yakit);       // BToyota

        Araba corolla3=new Corolla();

        //System.out.println(corolla3.model);     // CTE
        //System.out.println(corolla3.uretimYeri);//   CTE
        //System.out.println(corolla3.yil);       //   CTE
        //System.out.println(corolla3.marka);     //   CTE
        System.out.println(corolla3.motor);       //  Araba
        System.out.println(corolla3.plaka);       //  Araba
        System.out.println(corolla3.yakit);       // Araba


        BToyota toyota1=new BToyota();
        System.out.println(toyota1.marka); //BToyota
        System.out.println(toyota1.model); //BToyota
        System.out.println(toyota1.motor); //Araba
        System.out.println(toyota1.plaka); //Araba
        System.out.println(toyota1.yil);   //BToyota
        System.out.println(toyota1.yakit); //BToyota

        Araba toyota2=new BToyota();
        //System.out.println(toyota2.marka); // CTE
        //System.out.println(toyota2.model); // CTE
        System.out.println(toyota2.motor); //Araba
        System.out.println(toyota2.plaka); //Araba
        //System.out.println(toyota2.yil); // CTE
        System.out.println(toyota2.yakit); // Araba

        Araba araba=new Araba();
        System.out.println(araba.motor); //Araba
        System.out.println(araba.plaka); //Araba
        System.out.println(araba.yakit); //Araba

    }

}
