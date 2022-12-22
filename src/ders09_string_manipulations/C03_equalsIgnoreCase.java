package ders09_string_manipulations;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

     String str1="Ali";
     String str2="ali";
     String str3="ALİ";

     System.out.println(str1.equals(str2));
     System.out.println(str1.equals(str3));

     System.out.println(str1.equalsIgnoreCase(str2));
     System.out.println(str1.equalsIgnoreCase(str3));

     System.out.println(str1.equalsIgnoreCase("Ali "));

        /*
        equalsIgnoreCase aynı metnin büyük-küçük harf kullanılarak oluşturulan farklı yazılımlarını
        birbirine eşi olarak kabul eder. Yanı equalsIgnoreCase için ALİ,ALi,ali,aLi ayndır.
        Ama kelimede farklılık varsa tolere etmez.a li ile ali eşit olmaz.
         */



    }
}
