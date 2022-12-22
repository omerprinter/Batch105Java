package ders11_stringManipulations;

public class C02_replace {
    public static void main(String[] args) {

        String str="Java candir";

        System.out.println(str.replace('a', 'A'));

        System.out.println(str.replace(' ','_')); //Java_candir

        System.out.println(str.replace("candir","cok guzeldir.")); //Java cok guzeldir.

        System.out.println(str.replace(" ","")); //Javacandir

        // bütün a ları yok edelim
        System.out.println(str.replace("a",""));

        // java yerine hava, candır yerine cok güzel yazdıralım
        System.out.println(str.replace("Java","hava")
                .replace("candir","cok guzel")); // replace leri .replace diye ekleyerek arttırabirilir

        System.out.println(str.replace("","_")); // _J_a_v_a_ _c_a_n_d_i_r_

        //sadece 1. a yı A yapın
        System.out.println(str.replaceFirst("a","A")); // sadece ilk a yı A yapacak


    }
}
