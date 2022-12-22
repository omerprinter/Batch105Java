package ders20_multiDimensionalArrays;

import ders18_arrays.C06_KullanıcıyaArrayOlusturma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_ArrayList {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        C06_KullanıcıyaArrayOlusturma obj1=new C06_KullanıcıyaArrayOlusturma();

        List<Integer> sayilar= new ArrayList<>();

        // 1- List primitive data kabul etmez
        // 2-List bir interface old. icin direk obje olusturulamaz
        // onun yerine sag tarafa ArrayList<>() yazarız.

        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar);


    }
}
