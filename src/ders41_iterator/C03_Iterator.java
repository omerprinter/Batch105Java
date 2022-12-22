package ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // iterator kullanarakbu listeden 15 ile 35 arasindaki sayilari silin

        Iterator it1= sayilar.iterator();
        Integer element;

        while (it1.hasNext()){
          element= (Integer) it1.next();


            if (element>15 && element<35){
                it1.remove();
            }


        }
        System.out.println(sayilar); // [10, 40]

        sayilar.add(20);
        sayilar.add(30);
        System.out.println(sayilar);

        // tum elementleri iterator ile silelim

        Iterator it2=sayilar.iterator();

        it2.next(); // 10  u secti
        it2.remove(); // 10  u sildi

        it2.next();  // 40 i  secti
        it2.remove(); // 40 i  sildi

        while (it2.hasNext()){  // eleman oldukca dongu calisiri
            it2.next();   //  tum elementleri secer
            it2.remove(); // secilen elemntleri siler.  liste bosaldi.
        }

        System.out.println(sayilar); //[40, 20, 30]

    }
}
