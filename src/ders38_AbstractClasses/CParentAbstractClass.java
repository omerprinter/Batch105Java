package ders38_AbstractClasses;

public abstract class CParentAbstractClass {
    /*
    Abstract bir class abstract methodlara sahip olabilir
    Bir class'i abstract yapmak icin class declaration'a abstract eklenmelidir.
     */

    public abstract void mecburiMethod1();

    public abstract void mecburiMethod2();
    // Soyut yani Abstract methodlarin body'si olmaz

    public String concreteMethod(){
        // bugune kadar kullandigimiz normal method'lara concrete  somut method denir.
      return "";
    }

    /*
    Bir parent class'ta child class'larin mutlaka override edecegi bir method olusturdugumuzda
    method body'si gereksizlesir.
    Cunku hic calismayacaktir.

    1- abstract parent class'tan obje olusturulamayacagi icin objeler icin bu method kullanilamaz
    2- child class'larda mecburen bu methodu override edeceklerinden,
        bu methodlarin body'si ASLA KULLANILMAYACAKTIR.

     Java hic kullanilmayacak bu method body'leri yazmamamiza imkan tanimistir.
     */

    // Child class'larin mutlaka override etmesini istedigimiz methodlari
    // abstract olarak tanimlar ve body'siz olarak olusturulur
}
