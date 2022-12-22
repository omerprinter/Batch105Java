package ders08_ternary_Switch;

public class C04_Ternary {
    public static void main(String[] args) {
    //   Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
    //           ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        int k1=-11;
        int k2=-11;
        int k3=-11;

        System.out.println(k1==k2&&k2==k3 ? "eşkenar üçgen" : "eşkenar üçgen değil");

// kullanıcıdan iki sayı alın büyük olmayanı yazdırın

        int sayı1=11;
        int sayı2=11;

        System.out.println(sayı1>sayı2 ? sayı2 : sayı1);
    }
}
