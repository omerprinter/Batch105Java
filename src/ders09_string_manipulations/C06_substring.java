package ders09_string_manipulations;

public class C06_substring {
    public static void main(String[] args) {

        String str="Java ogren, isi kap";
        System.out.println(str.substring(5)); // o ve sonrası==> ogren, isi kap
        System.out.println(str.substring(0));

        System.out.println(str.length());

        String sonHarf=""+str.charAt(str.length()-1);
        sonHarf=str.substring(str.length()-1);
        System.out.println(sonHarf);

        // son index teki karakteri upper case olarak yazdırın

        System.out.println(str.substring(str.length()-1).toUpperCase()); //  p==> P olur

        // son 3 harfi büyük harf olarak yazdırın
        System.out.println(str.substring(str.length()-3).toUpperCase()); // kap ==> KAP olur
    }
}
