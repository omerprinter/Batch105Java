package ders29_stringBuilder_accessModifier;

public class C05_AccessModifier {
    public static void main(String[] args) {

        C04_AccessModifier obj= new C04_AccessModifier();

        obj.isim="Tugay";
        System.out.println(obj.isim); // Tugay
        // obj.sayi=20; private variable'lara baska class'dan ulasilamaz

        C04_AccessModifier obj2= new C04_AccessModifier();
        System.out.println(obj2.isim); // Ali
    }
}
