package ders09_string_manipulations;

public class C05_lenght {
    public static void main(String[] args) {

        String str="Uzunkavaklaraltındayataruyumazoğlu";
        System.out.println(str.length());
        System.out.println(str.charAt(33));
        System.out.println(str.charAt(str.length()-1)); // son karakteri elde etmek için

        // sondan 3. karakteri yazdırma
        System.out.println(str.charAt(str.length()-3));


    }
}
