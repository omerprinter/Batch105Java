package ders34_overriding_polimorphism;

public class DChild extends CParent{
// private<default<protected<public  access modifier.

    public void method1(){

    }
public static void method2(){

}
    private void method3(){

    }
    public void method4(){}

    public Integer method5(){
        return 5;
    }
/*
 /* Overriding kuralları
    1- access modifier method signature'a dail olmadığından
     overridden ve overriding access modifier 'lar farklı olabilir
     chıld parent'i sınırlandıramaz
     yani overriding method'un access modifier'i aynı veya daha geniş kapsamlı olmalı
                   private -- default -- protected--publıc

    2- Private ve static method'lar override edilemez
     aynı isimde method olusurulunca java CTE vermez
     ancak override işareti çıkmaz ve @Override notasyonu kullanılmak istenirse CTE olur.
     Yani java bunları farklı class'lardaki farklı method'lar olarak kabul eder.

    3- Return type method signature'ına dahil olmadığından farklı seçilebilir,
      ancak return type void veya primative ise  aynı olmak zorundadır.
      Eğer return type'lar non-primitive ise , child class'daki return type,
      parent class'daki return type'i ile aynı veya chıld'ı olmalıdır.

     */

}
