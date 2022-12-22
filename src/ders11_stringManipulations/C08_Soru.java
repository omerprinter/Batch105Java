package ders11_stringManipulations;

public class C08_Soru {
    public static void main(String[] args) {
      // : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
      // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
      //         eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
      //
        //         - ilk harf kucuk harf olmali
      //           - son karakter rakam olmali
      //           - sifre bosluk icermemeli
      //           - uzunlugu en az 10 karakter olmali

        String sıfre="nasılsınKardes1";
        int bayrak=0;

        if (!(sıfre.charAt(0)>'a'&&sıfre.charAt(0)<='z')){
            System.out.println("ilk harf küçük olmalı");
            bayrak++;
        }
        if (!(sıfre.charAt(sıfre.length()-1)>='0'&&sıfre.charAt(sıfre.length()-1)>='9')){
            System.out.println("son karakter rakam olmalı");
            bayrak++;
        }
        if (sıfre.contains(" ")){
            System.out.println("şifre boşluk içermemeli");
            bayrak++;
        }
        if (!(sıfre.length()>=10)){
            System.out.println("şifre en az 10 karakter olmalı");
            bayrak++;
        }
        if (bayrak==0){
            System.out.println("şifreniz basarıyla kaydedildi");
        }


    }
}
