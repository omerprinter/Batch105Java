package ders08_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int a=11;
        /*
        ternary operatörü tek başına kullanılamaz.
        ternary bize sonuç verir.
        bu sonucu ya direk yazdırmalı ya da bir variable ye atamalıyız
         */

        String sonuc= a%2==0 ? "çift sayı" : "tek sayı";
       /*
       Ternary'nin sonucunu bir variabla'a atayacaksak true ve false durumlarında üretilecek sonucun
       aynı data türüne uygun olması gerekir.Aksi halde CTE oluşur.
       Ama Ternary i sout içinde kullanırsak sonuçların data turunun aynı olması gerekmez
        */

       String sonuc2= a>10 ? "büyük sayı" : ""+2*a; // CTE vermemesi için Stringe çevirdik

        System.out.println(a>10 ? "büyük sayı" : 2*a);

    }
}
