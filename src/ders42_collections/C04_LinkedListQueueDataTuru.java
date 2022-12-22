package ders42_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQueueDataTuru {
    public static void main(String[] args) {

        Queue<String> q1 = new LinkedList<>();

        q1.add("H");
        q1.add("Y");

        q1.offer("K");
        // kapasite sinirlamasi yapilmadigi surece  .add() ile ayni isi yapar.Aksi halde exception firlatir

        System.out.println(q1.remove());  // ilk element  'yi sildi
        // Queue eklemeyi sona yapip kullanmayi bastan yaptigi icin parametre girmediginizde
        // bastaki elementi remove  ederve biz dondurur.

        System.out.println(q1.remove("K")); // K 'yi kaldirdi
        q1.remove(); // bos queue kaldi

        // q1.remove(); // NoSuchElementException
        System.out.println(q1.poll()); // null
        // q1.poll  remove ile ayni islemi yapar yani bastaki elemani siler ve bize dondurur
        // aralarindaki fark  bos queue calistirildiginda remove exception firlatirken ,poll firlatmaz.

        q1.add("H");
        q1.add("Y"); // [H, Y]

        System.out.println("q1.peek : "+q1.peek()); //  H
        // silmeden queue'nin basindaki elementi getiriyor. bos ise null getiriyor.

        System.out.println("q1.element() : "+q1.element()); // H

        q1.clear(); // listeyi bosalttik

        System.out.println("q1.peek : "+q1.peek()); // null
        // System.out.println("q1.element() : "+q1.element()); NoSuchElementException


    }
}
