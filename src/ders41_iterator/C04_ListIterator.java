package ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        //  iterator kullanarak listenin elementlerini sondan basa dogru yazdirin

        // once iterator i sona goturelim
        ListIterator lit=sayilar.listIterator();

        while (lit.hasNext()){
            lit.next();
        }
        // simdi sondan basa dogru gidelim giderken eementleri yazdiralim
        while (lit.hasPrevious()){
            System.out.print(lit.previous()+" ");
        }

        // iterator kullanarak , listenin tum elementlerini 5 arttirin

        // eger iterator'i nerede biraktigimiz hatirlayamazsak
        // iterator.nextIndex() ile hangi index oncesinde oldugumuzu gorebiliriz
        System.out.println("");
        System.out.println(lit.nextIndex());

        while (lit.hasNext()){
            lit.set((Integer)lit.next()+5);  // cast ederek yazdik.gelen sayiya 5 ekleyerek set ettik==>[15, 25, 35, 45]

        }
        System.out.println(sayilar); // [15, 25, 35, 45]

        // iteraor kullanarak 40'dan kucuk olan elementleri silin

        System.out.println(lit.nextIndex());  // iterator 'in 4. indexte oldugunu verir.

        while (lit.hasPrevious()){
            if ((Integer)lit.previous()<40){ // 40 'dan kucuk olanlari silin
                lit.remove();
            }
        }
        System.out.println(sayilar);  //  [45]

    }
}
