package ders28_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        topla(5,6);     // 2 sayı
        topla(5,3,8);
        topla(2,4,6,8);
        topla(1);
        topla();
        topla(4,1,2,5,7,8,344,5,77,58,1,0,3,44);


        /*
        bir method da parametre sayisini sınırlandirmak istemezsek
        standart bir variable yerine varargs  kullaniriz.

        vararg  data turunun yanina  ...   konularak deklare edilir.
        int...  ==> sayisi belirli olmayan integer parametreler olan bir array'dir.
         */

    }

    public static void topla(int... sayilar) {

        int toplamSonucu=0;

        for (int each:sayilar
             ) {
            toplamSonucu+=each;
        }
        System.out.println("girilen sayilarin toplami : "+toplamSonucu);

    }
}
