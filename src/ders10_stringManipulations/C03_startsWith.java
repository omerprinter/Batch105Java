package ders10_stringManipulations;

public class C03_startsWith {
    public static void main(String[] args) {

        String str="manti acarken java ogrenılmez";
        System.out.println(str.startsWith("Manti")); // Manti ile mi başlıyor==> false

        System.out.println(str.startsWith("m")); // true
        System.out.println(str.startsWith("manti acarken java ogrenılmez")); //true

        System.out.println(str.startsWith("")); // true

        System.out.println(str.startsWith("acarken", 6)); // true

        System.out.println(str.startsWith("manti", 0)); // true

        System.out.println(str.startsWith("java", 10)); //false
    }
}
