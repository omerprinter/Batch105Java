package ders37_exception;

public class C02_ClassCastException {
    public static void main(String[] args) {

        short sayi1=23;
        int sayi2=sayi1;

        Short sayi3=24;
      //  Integer sayi4=sayi3;  Integer ve Short arasinda parent child iliskisi olmadigindan
        //                       birbirine atama yapamazsiniz.


        //Aralarinda parent-child iliskisi olan clas'lardan olusan objeler icin
        // auto=widening veya explicit-narrowing mumkundur.

        Object obj=sayi3;
        System.out.println("Short'tan Obje'ye cast edince : "+obj);

        Integer sayi5= (Integer) obj;

        System.out.println("Short datayi obje uzerinden Integer a cevirince "+sayi5);

    }
}
