package ders17_scope;

public class C01_LocalVariables {
    public static void main(String[] args) {
        // bir methodun icerisinde olusturulan variable  ların scope u
        // icinde olusturuldukjları methodtur
        // o method dısından ulasulamazlar.

        int sayi=10;
        String isim="Ramazan";


        for (int i = 0; i <10 ; i++) {
            String adres="Ankara";


        }
        //System.out.println(adres);
        // adres  for loop un icinde local variable oldugundan for dısında kullanılamaz
        // Aynı method icinde olsa bile.

        double pi;
        // System.out.println(pi);  ====> local variable lar deger atamadan olusturulabilir ancak kullanılamaz
        // kullanmadan önce deger atanmıs olmalıdır.


    }
    public static void method1(){

      // System.out.println(sayi);
      // isim="tugay";



    }


}
