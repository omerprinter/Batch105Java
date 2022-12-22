package ders42_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1=new LinkedList<>();

        ll1.add("K");
        ll1.add("T");

        // LinkedList  3 tane inteface'i implement etmistir.
        // List-Queue- Deque interfce deki tum abstract 'lari override etmistir.


        List<String> ll2=new LinkedList<>();
        // daha once arrayList olustururken List<> interface'ini kullandigimizdan biliyoruz

        ll2.add("R");  //  [R]
        ll2.add("Z");  //  [R ,Z]
        ll2.add(0,"A");  //  [A ,R ,Z]

        ll2.addAll(2,ll1); // [A, R, K, T, Z]  ll1  ekledik 2. index'e Z'yi oteledi

        ll2.set(3,"M");  //  [A, R, K, M, Z]  3. index T'yi  ,  M  ile degistirdi


        System.out.println(ll2.get(1)); //  R  ==>  1. indexi getirdi.
        ll2.add("K");
        ll2.add("T");

        System.out.println(ll2); // [A, R, K, M, Z, K, T]

        System.out.println(ll2.retainAll(ll1)); //  true..  ll1 dekileri tutar digerlerni siler

        System.out.println(ll2); // [K, K, T]
        ll2.add("A");

        System.out.println(ll2.hashCode()); // 3232590  [K, K, T, A]

        System.out.println(ll2.subList(2, 4)); //2. dahil 4. haric oldugundan sorun yapmadi [T, A]



    }
}
