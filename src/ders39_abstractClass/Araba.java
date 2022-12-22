package ders39_abstractClass;

public abstract class Araba {

    // Araba clasini inherit eden tim calss'lar
    // maeka,motor, kasa, tekerlek  methodlarini override etmek zorunda kalsin
    // ABS. Klima methodlari opsiyonel olsun isteyen childlar oerride etsin.

    public abstract void motor(); // abstract methodun body'si olmak zorunda degil.olmaz

    public abstract void marka();

    public abstract void kasa();

    public abstract void tekerlek();

    public void abs(){
        System.out.println("Guvenlik artirmak isteyen araclar ABS kullanmali");
    }

    public void klima(){
        System.out.println("Konfor artirmak isteyen araclar Klima kullanmali");
    }

}
