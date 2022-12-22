package ders26_passByValue_immutableClasses;

public class C07_ImmutableString {
    public static void main(String[] args) {

        String str="Java Candir";

        str=str.toUpperCase();

        System.out.println(str); //  JAVA CANDİR

        /*
        immutable class lardan olusturulan bir objenin degeri DEGİSTİRİLEMEZ.
        Eger atama yaparsak java degerini degistirmez bunun yerine yeni bir obje olusturur
        ve bu yeni objeye yeni atadıgımız degeri atar.

        eski obje bosa cıkar garbage collector tarafından silinmeyi bekler
         */


    }
}
