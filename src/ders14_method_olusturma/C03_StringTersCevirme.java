package ders14_method_olusturma;

public class C03_StringTersCevirme {
    // parametre olarak bir String kabul edip
    // Stringi ters ceviren halini donduren bır method yazın.

    public static void main(String[] args) {

        String input="java kod yazdikca ogrenilir";

        System.out.println(terstenYazdirma(input));

    }

    public static String terstenYazdirma(String input){
        String tersStr="";

        for (int i =input.length()-1; i >=0 ; i--) {
            tersStr=tersStr+input.charAt(i);

        }
        return tersStr;
    }
}

