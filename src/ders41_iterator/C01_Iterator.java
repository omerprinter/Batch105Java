package ders41_iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
/*
Java collection içerisindeki bazı class'lae index desteklemez !
        bu durumda index kullanmadan collection içerisindeki tüm elementlere ulaşabilmek
        ve onları update edebilmek için farklı ihtiyaçlarınız olur.

        List<> index yapısını desteklediği için böyle bir ihtiyaç duymaz
        ANCAK bugünlük index kullanmadan list elementlerine ulaşmaya ve onları update etmeye çalışalım
         */


        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // index kullanmadan List'in tum elementlerini yazdirin

        for (Integer each:sayilar) {
            System.out.print(each+" ");

        }
        System.out.println("");
        // index kullanmadan List'in elementlerini 1'er arttirin
        //index kullanmadan 25'den buyuk sayilari Listten silin
        for (Integer each: sayilar ) {
            System.out.print(each+1+" "); //11 21 31 41  1'er arttirdik ama kalici olmadi
        }
        System.out.println("");
        System.out.println(sayilar); //[10, 20, 30, 40] atama yapilmadigi icin
        System.out.println("");
        for (Integer each:sayilar) {
            each+=1;
            System.out.print(each+" "); // 11 21 31 41 atama var ama loop icinde gcerli
        }
        System.out.println("");
        System.out.println(sayilar); //[10, 20, 30, 40]
        /*
        Index kullanmadan LİST'in elemanlarını kalıcı olarak değiştirmek mümkün olmadı :/
        Java bunun için Iterator İnterface'i oluşturmuştur.
         */


    }
}
