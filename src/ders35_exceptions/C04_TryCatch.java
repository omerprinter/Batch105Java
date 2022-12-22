package ders35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_TryCatch {
    public static void main(String[] args) {
        /* Kullanıcıdan istedğişi kadar sayı girmesini isteyip
            Girilen sayıları toplayın
            kullanıcının işlemi bitirmek için Q'ya basmasını isteyin Q'ya basıldığında
            toplam kaç sayı girdiğini  ve bu sayıların toplamının kac  oldugunu yazdırın
         */

        Scanner scan=new Scanner(System.in);
        double girilenSayi=0;
       double sayilarinToplami=0;
        int sayac=0;
        boolean devam=true;

        while (devam){
            System.out.println("Toplanmak uzere sayi giriniz.\nBitirmek icin Q'ya basiniz");

            try {
                girilenSayi= scan.nextDouble();
                sayilarinToplami+=girilenSayi;
                sayac++;

            } catch (InputMismatchException e) {

                String str=scan.next();
                if (str.equalsIgnoreCase("q")){
                    break;
                }

            }

        }
        System.out.println("Girilen : "+sayac+" adet sayinin toplami : "+sayilarinToplami);

        /*
        1- Exception, (Istisna) java kod yazrken handle edemedigi bir kod blogu ile
        karsilastiginda cozumu bizden bekler.
        2- Kodlarimizi yazarken muhtemel exception durumlarini ongormeli ve bu durumlara
        cozum olarak java'nin yapmasini istedigimiz islemleri java'ya soylemeliyiz.
        3- Eger biz exception olasiligini ongoremez veya ongordugumuz halde java'ya ne
        yapmasini istedigimizi soylemezsek Java calismayi durdurur ve bize hata raporu verir.
        4- Exception'lari handle etmek icin kullanacagimiz en onemli yontem try-catch
        bloklaridir.
        5- try-catch bloklari temel 3 bolumden olusur
        - exception uretmesi muhtemel kodlarimizi koydugumuz try blogu
        ongordugumuz exception'i yakaladiginda icerisine koymasini istedigimiz
        exception objesini belirttigimiz catch parantez
        -
        Ongordugumuz exception gerceklestiginde java'nin yapmasini istedigimiz
        kodlari yazdigimiz catch blogu
         */

    }
}
