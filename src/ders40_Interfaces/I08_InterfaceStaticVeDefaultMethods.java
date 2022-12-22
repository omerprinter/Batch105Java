package ders40_Interfaces;

public interface I08_InterfaceStaticVeDefaultMethods {
    /* Java 8 ile developer'ların talabi üzerine yeni bir istisnai durum java'ya eklenmiştir
       bir isterface'i yıllar içerisinde yüzlerce class inherit etmiş olabilir.
       sonradan Interface'e eklenen bir abstract method tüm eski child'lar tarafından inherit
       edilmelidir. Aksi takdirde tüm eski child class'lar CTE verecektir

       Java 8 ile birlikte Java, Interface'lere default veya static ile işaretlenmek şartı ile
       body'si olan method eklenmesine izin vermiştir.
        Bu sayede interface'e sonradan eklenen method body'si oldugu icin
        override edilmek zorunda degildir.

        Interface icerisinde body'si olan method olusturmak icin kullanilan
        default ve static keyword'leri arasinda tek bir fark vardir.

        default kullanilan metodlar obje olusturularak cagrilabilir
        static olarak isaretlenenler direk kullanilabilri

        */
    void method1();
    void method2();

    // interface'deki tum methodlar public ve abstract'tir
    // biz interface'deki bir method deklerasyonuna default yazarsak
    // bu access modifier degildir.


        public default void method3(){
            System.out.println("interface icindeki body'li default method");
    }

    public static void method4(){
        System.out.println("interface icindeki body'li static method");
    }
}
