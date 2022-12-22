package ders40_Interfaces;

public class I02_ConcreteChildClassOfInterface implements I01_Interface {
    //Bir class'ı bir interface'in chıld'ı yapmak için ipmlements keyword kullanılır.

    public static void main(String[] args) {

        System.out.println(MESAJ);
//sayi=40;  // sayi2=40; yazılı olmasada interface içerisinde
// olduğundan final'dir ve atama yapılamaz

        System.out.println(Integer.MAX_VALUE);
// Normal'de veriable isimleri kucuk harfle başlar ve camelCase kullanılır
        // ancak Java'da ortak kabul olarak
        // static ve final olarak işaretlenen veriable isimleri
        // tamamen büyük harf ile yazılır.
        System.out.println(Math.PI);
    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
