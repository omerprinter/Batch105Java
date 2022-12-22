package ders40_Interfaces;

public interface I03_InterfaceChildOfInterface extends I01_Interface{

    //Eger bir İnterface'i baska bir interface'in child'i yapmak isterseniz
    //extends keyword kullanılır.

    // Bir interface, concrete class'i INHERIT EDEMEZ
    void method1();
    //Interface bir child parent Interface'deki
    // abstract merhod'u override edebilir
    //Ama ikisininde body'si olmadığından
    // bu işlemin bir anlamı yoktur

    int method4();
    boolean method5();

}
