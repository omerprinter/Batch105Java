package ders14_method_olusturma;

public class C02_StringConcate {

    // verilen iki stringi parametre kabul edip
    // aralarına bir bosluk olan tek bir String olam method olusturun, main methoda dondursun
    public static void main(String[] args) {

        String str1="Java";
        String str2="Candir";

        System.out.println(birlestirMethodu(str1, str2));
        System.out.println(birlestirMethodu("Bu da","oldu"));
        System.out.println(birlestirMethodu("Anladınız","mı?"));
        System.out.println(birlestirMethodu("Anladık","hocam"));


    }
    public static String birlestirMethodu(String str1, String str2){

        return str1+" "+str2;
    }

}
