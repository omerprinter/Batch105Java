package ders29_stringBuilder_accessModifier;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java ne kadar guzel");

        System.out.println(sb.substring(4)); //  ne kadar guzel==>String dondurur.KALICI OLMAZ!!

        System.out.println(sb); // Java ne kadar guzel
        //sb=sb.substring(4); esitligin solu StringBuilder, sagi ise String
        //                     Java non-primitive datalarda casting YAPMAZ
        // Yni not Integer,Byte, ve short gibi sayi iceren non-primitive ler icin de gecerlidir
        //
        // sb guzel kelimesi iceriyor mu?
        /*
        StringBuilder da olmayan, String class'inda bulunan methodlari kullanmak istersek,
        önce toString()  ile String e cevirip sonra manipulation yapabiliriz
         */
        System.out.println(sb.toString().contains("guzel")); // true

        sb.setCharAt(5,'N');  //  5. index i N  yapti
        System.out.println(sb); //  Java Ne kadar guzel


    }
}
