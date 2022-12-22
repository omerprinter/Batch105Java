package ders29_stringBuilder_accessModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java Candir");
        System.out.println(sb1.reverse()); //  ridnaC avaJ  ters cevirir. ***KALICI OLARAK***

        System.out.println("tersini yazdırdıktan sonra sb1 : "+sb1); // ridnaC avaJ

        System.out.println(sb1.insert(0, ".")); // .ridnaC avaJ
        System.out.println(sb1); // .ridnaC avaJ kalıcı oldu

        sb1.reverse();

        StringBuilder sb2=new StringBuilder("Java Candir.");
        String str="Java Candir.";

        System.out.println(sb1==sb2);  //  false  ==> icerik aynı olsa bile false verir
        System.out.println(sb1==sb1);  // true   ==> sadece kendisi ile karsilastirilirsa true olur
        //System.out.println(sb1==str);  FARKLI IKI DATA TURU ILE KARSILASTIRILAMAZ

        System.out.println(sb1.equals(sb2));  // false ==> icerik aynı olsa bile false verir
        System.out.println(sb1.equals(sb1));  // true   ==> sadece kendisi ile karsilastirilirsa true olur
        System.out.println(sb1.equals(str));  // CTE vermez fakat sonuc herzaman false verir

        System.out.println(sb1.compareTo(sb2)); // 0  int doner

        StringBuilder sb3=new StringBuilder("Jaka Kandir");
        System.out.println(sb1.compareTo(sb3)); // 11  ==> Java, v ile Jaka, k  arasindaki harf farkini verdi
        /*
        CompareTo  sadece tamamen  ayni mi yoksa farkli mi sorusunun cevabini verir.
        tamamen ayni ise ==>  0
        farklılık var ise==> ilk farkliliktakilerin arasindaki harf sayisini verir.
         */

    }
}
