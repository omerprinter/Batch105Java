package ders35_exceptions;

public class C02_ArithmeticException {
    public static void main(String[] args) {

        // Verilen iki tamsayiyi biribirine bolup sonucun tam sayi kismini yazdirin

        int sayi1=20;
        int sayi2=0;

        try {
            //riskli oldugunu ongordugumuz kodlar.
            System.out.println(sayi1/sayi2);
            System.out.println("Bakalim bu satir calisacak mi?");

        } catch (Exception e) {
            //catch (Exception e) ongordugumuz risk
            System.out.println("sayi sifira bolunemez");
            //catch blogu.... beklenen risk gerceklesirse calisacak blok
        }



        /*
        Bazi exception'lar if-else ile handle edilebilir. Ancak
        tum exception'lar icin if else'ler yeterli olmaz.
         */


    }
}
