package ders29_stringBuilder_accessModifier;

import java.util.ArrayList;
import java.util.List;

public class C06_Encapsulation {
    /*
    Buyuk projelerde datayi gorme(read) veya datayı degistirme(write)
    yetkilerini birbirinden bagimsiz olarak duzenlemek istenebilir

    Access modifier ile class uyelerine baska class lardan erisim sınırlandirilabilir
    ANCAK
    ulasılablien dataya hem okuma hem yazma yapılabilir
    ulasilamayan data ne okunabilir ne de ddegidtirilebilir

    gercek hayattaki ihtiyaclar dusunuldugunde Java ya
    yetki sinirlamayı uyarlamak istersek

    --Eger okuma ve yazma yetkisini birlikte vermek veya vermemek sözkonusu ise Access Modifier  kullanıılır

    --Eger  okuma ve yazma yetkileri birbirinden ayrılacaksa o zaman Access Modifier yeterli olmaz
    Encapsulation(getter--setter) methodları kullanılabilir.
     */

    //  get ve set daha onceki java objelerinde karsımıza cıkmıstı

    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);

        //  sayilar.get(1)=10;  okumaya izin var ama deger atamaya yani yazmaya izin YOK

        // System.out.println(sayilar.set(1)); ==> set  varsa MUTLAKA deger atamalısın

    }
}
