package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {

        Deque<String> dq1=new LinkedList<>();
        dq1.add("K");
        dq1.add("B");   // [K, B]
        dq1.addLast("F"); // [K, B, F]
        dq1.addFirst("A"); // [A, K, B, F]

        System.out.println(dq1.getFirst());  // A
        System.out.println(dq1.getLast());  //  F

        System.out.println(dq1.remove()); // A 'yi sildi     [K, B, F] kaldi
        System.out.println(dq1.poll());  //  K  'yi sidi   [B, F] kaldi
        System.out.println(dq1.removeLast()); // F 'yi sildi    [B]  kaldi
        System.out.println(dq1.remove());  //  B  'yi sildi  bosaldi

       // dq1.remove(); NoSuchElementException
        System.out.println(dq1.poll()); // null
        // poll()  bos olmasina ragmen exception firlatmaz.  remove() exception firlatir

        dq1.add("K");
        dq1.add("B"); // [K, B]

        dq1.push("F");  //  [F, K, B]
        // deque 'in basina element ekelr


        System.out.println(dq1.pop()); // F verir.
        // ilk elementi siler ve bize sildigi elemnti dondurur. removeFirst() ile ayni islevi gorur

        System.out.println(dq1.element()); // K
        // ilk elementi silmeden bize dondurur. exception firlatir

        System.out.println(dq1.peek());  //  K
        // bos deque  de calisirsa null  dondurur.
        System.out.println(dq1.peekFirst()); // K
        System.out.println(dq1.peekLast());  // B

        System.out.println(dq1.offer("C")); // true
        // liste [K, B, C]  oldu
        System.out.println(dq1.offerFirst("M")); // true  ===> [M, K, B, C] oldu basa M ekledi




        System.out.println(dq1);

    }
}
