package ders14_method_olusturma;

public class C04_Tekrar {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        // bu iki sayının cvarpim sonucunu yeni kod yazmadan konsola yazdırın

        System.out.println(C01_Carpim.carpimMethodu(a, b));

        String c="Nasil oluyor";
        String d="YANİ";
        // bu iki stringi aralarında boşluk bırakarak yazdırın
        System.out.println(C02_StringConcate.birlestirMethodu(c, d)); // Nasil yani

        String e="Bu da mi oldu?";
        // e stringini tesrten yazdırın
        System.out.println(C03_StringTersCevirme.terstenYazdirma(e));
        System.out.println(C03_StringTersCevirme.terstenYazdirma("ne var ne yok bilmiyom"));

        String str="Java cok guzel";
        System.out.println(str.toUpperCase());

    }


}
