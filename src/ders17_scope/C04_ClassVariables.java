package ders17_scope;

public class C04_ClassVariables {

    public static void main(String[] args) {
        // C03  teki hastane ismini yazdırmak istiyoruz
        System.out.println(C03_ObjectVariables.hastaneIsmi);

        System.out.println(C03_ObjectVariables.hastaSayisi);

        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1();
        System.out.println(C03_ObjectVariables.hastaSayisi); // 23456

    } // kod takibi main method tan başlar sonunda biter

    public static void method1(){
        C03_ObjectVariables.hastaSayisi++;
    }
}
/*
Java RunTıme programdır.
atanan degerleri işler
main method bitince resetler.
 */