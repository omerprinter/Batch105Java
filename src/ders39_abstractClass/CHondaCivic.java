package ders39_abstractClass;

public class CHondaCivic extends BHonda{
    @Override
    public void motor() {
        System.out.println("HondaCivic araclar vtec teknolojili cevreci motor kullanir");
    }

    @Override
    public void kasa() {
        System.out.println("Civic araclar sedan veya hb kasa kullanir");
    }

    @Override
    public void tekerlek() {
        System.out.println("civic araclar 205*16*55 teker kullanir");
    }

    @Override
    public void yakit() {
        System.out.println("civic araclar benzinlidir");
    }

    @Override
    public void guvenlik() {
        System.out.println("civic araclar guvenlik standardina uyar");
    }

    @Override
    public void abs() {
        System.out.println("Honda Civic arabalar standart olarak abs kullanir");
    }

    @Override
    public void klima() {
        System.out.println("Honda Civic arabalar standart olarak klima kullanir");
    }

    public static void main(String[] args) {

 /*
        Abstract parent class'lardaki abstract method'lar
        concrete child class'lar tarafından mecburen override edilir

        Ancak abstract parent'lardaki concrate method'ları override etmek mecburi değildir
        Eger Chıld class'a uyarlamak isterseniz override edebilirsiniz
        veya override etmeyip parent classs'daki haliyle kullanabilirsiniz.
         */

        CHondaCivic civic1=new CHondaCivic();
        civic1.abs(); // Araba
        civic1.klima();// Araba
        civic1.marka(); // Honda
        civic1.ozelTeknoloji(); // Honda
    }
}
