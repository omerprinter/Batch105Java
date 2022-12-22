package ders13_nestedForLoop_methodOlusturma;

public class C07_MethodOlusturma {
    public static void main(String[] args) {

        String str="Java muhtesemdir";

        // metni uppercase yapalım

        String buyukStr=str.toUpperCase();

        System.out.println(str);
        System.out.println(buyukStr);

        // metnin buyuk harf hali S icerir mi?
        System.out.println(buyukStr.contains("S")); // true

        /*
        YAPMAYI PLANLADIĞIMIZ BİR İŞLEMİ YAPIP BİZE SONUC DONDURMASI ICIN OLUSTURDUGUMUZ KOD BLOGUDUR.--robot gibi

        METHOD OLUSTURMAK BAZEN ISLEMIN KENDISINDEN DAHA UZUN OLABILIR, ANCAK JAVA OOP KONSEPT CERCEVESINDE
        BIR KODU BIIR KERE YAZIP HERZAMAN KULLANCAGIMIZ ISLEM ICIN IYIDIR.

        2 cesit method var
            1-bir islemi yapıp bize sonuc dondurmeyen veya sadece yazdıran( ELEKTRİK FATURASINI YATIRAN COCUK)
            2-islem yapıp bize sonuc donduren method.
         */

    }
}
