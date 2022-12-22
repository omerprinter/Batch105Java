package ders17_scope;

import java.util.Scanner;

public class C05_ObjectVariables {

    public static void main(String[] args) {

        //C03 Class ındaki instance variable lara nasıl ulasabiliriz?
        // instance variable ların obje variable larıdır
        // instance variable lara Obje uzerinden ulasabililriz

        C03_ObjectVariables pers1=new C03_ObjectVariables();
        System.out.println(pers1.persIsmi); //"isim girilmedi" yazar
        System.out.println(pers1.persYas); //  0

        pers1.persIsmi="suleyman";
        pers1.persYas=35;
        pers1.persTelefonu="5553456754";

        System.out.println(pers1.persIsmi); //"isim girilmedi" yazar
        System.out.println(pers1.persYas);

        C03_ObjectVariables pers2=new C03_ObjectVariables();
        pers2.persIsmi="Latife";
        pers2.persYas=32;
        pers2.persTelefonu="5554322321";

        System.out.println(pers1.persIsmi); // Suleyman
        System.out.println(pers2.persIsmi);  // Latife

        C03_ObjectVariables pers3=new C03_ObjectVariables();
        pers3.persIsmi="Heysem";
        pers3.persYas=30;
        pers3.persTelefonu="3122134567";

        System.out.println(pers1.persYas); //35
        System.out.println(pers2.persYas); // 32
        System.out.println(pers3.persYas);  // 30


    }
}
