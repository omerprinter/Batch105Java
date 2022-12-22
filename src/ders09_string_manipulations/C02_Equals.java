package ders09_string_manipulations;

public class C02_Equals {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";

        String str3=new String("Ali");
        String str4="Ali";

        System.out.println(str1==str2);

        System.out.println(str1==str3);

        System.out.println(str1==str4);
        /*
        == string leri karşılaştırırken beklediğimiz sonuçları vermeyebilir.
        stringlerde metinlerin aynı olup olmadığını karşılaştırmak için equals metodu kullanılır.
         */

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

    }
}
