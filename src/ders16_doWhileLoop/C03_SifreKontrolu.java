package ders16_doWhileLoop;

import java.util.Scanner;

public class C03_SifreKontrolu {
    public static void main(String[] args) {
        /*
        - Kullanicidan bir sifre girmesini isteyin.
        Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
        ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.

 - Sifre kucuk harf icermelidir
 - Sifre buyuk harf icermelidir
 - Sifre ozel karakter icermelidir
 - Sifre en az 8 karakter olmalidir.
         */

        Scanner scan=new Scanner(System.in);
        String sifre;
        int bayrak;
        boolean sifreDogruMu;

        do {
            System.out.println("Lütfen bir sifre giriniz:");
            sifre=scan.nextLine();
            // tum hataları sylemesini istiyorsak
            // bagımsız if cumleleri ve bayrak kullanmak zorundayız
            bayrak=0;
            int sonuc=kucukHarfKontroluYap(sifre);
            // method olusturduk . varsa 1 yoksa 0 dondursun
            bayrak=bayrak+sonuc;

           //Sifre buyuk harf icermelidir
           sonuc=buyukHarfKontroluYap(sifre);
            // method olusturduk . varsa 1 yoksa 0 dondursun
            bayrak=bayrak+sonuc;

            //Sifre ozel karakter icermelidir
            sonuc=ozelKarakterKontroluYap(sifre);

            if (sifre.length()<8){
                System.out.println("en az 8 karakter içermelidir");
            }


        }while (bayrak!=4);
        System.out.println("sifreniz basarı ile kaydedildi");

    }

   public static int ozelKarakterKontroluYap(String sifre) {
        int bayrak=0;
       String ozelKarakterler = "§±@!$%^&*#()_-+=?/>.<,`~";
        //sifre ozel karakter içermelidir
       // bunun için bir loop olusturup sifrenin karakterlerinden bir tanesini ozelKarakterler Stringi içeriyorsa
       // bizim için yeterli olur
       for (int i = 0; i <sifre.length() ; i++) {
           if (ozelKarakterler.contains(sifre.substring(i,i+1))){
               bayrak++;
               break;
           }


       }
       if (bayrak==0){
           System.out.println("Sifre kucuk harf icermelidir.");
           return 0;
       }else return 1;
    }

    public static int buyukHarfKontroluYap(String sifre) {
        int bayrak=0;
        //Sifre kucuk harf icermelidir. Tum harfleri kontrol edecek FOR LOOP lazım
        // 1 tane kucuk harf bulmam yeterli olacak.
        for (int i =0; i <sifre.length() ; i++) {

            if (sifre.charAt(i)>='A'&&sifre.charAt(i)<='Z'){
                bayrak++;
                break;
            }

        }
        // bayrak 0 olmaması lazım artması lazım.(ters calıstı)
        if (bayrak==0){
            System.out.println("Sifre buyuk harf icermelidir.");
            return 0;
        }else return 1;

    }

    public static int kucukHarfKontroluYap(String sifre) {
        int bayrak=0;
        //Sifre kucuk harf icermelidir. Tum harfleri kontrol edecek FOR LOOP lazım
        // 1 tane kucuk harf bulmam yeterli olacak.
        for (int i =0; i <sifre.length() ; i++) {

            if (sifre.charAt(i)>='a'&&sifre.charAt(i)<='z'){
                bayrak++;
                break;
            }

        }
        // bayrak 0 olmaması lazım artması lazım.(ters calıstı)
        if (bayrak==0){
            System.out.println("Sifre kucuk harf icermelidir.");
            return 0;
        }else return 1;

    }
}
