package ders45_Maps;

import ders44_maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {

        // ogrenciler map'inde  subesi H  olan ogrencilerin isim soyisim ve siniflarini yazdiralim

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
       /*
       {101=Ali-Can-10-H-MF,
       102=Veli-Cem-11-M-Soz,
       103=Ali-Cem-11-H-TM,
       104=Ayse-Can-10-H-MF,
       105=Ayse-Cem-11-M-TM,
       106=Fatma-Han-10-K-Soz}
        */

       Set<Integer> ogrenciKeySet= ogrenciMap.keySet();       // bir map'teki ky'leri Set  olarak dondurur.

        /*
        [101, 102, 103, 104, 105, 106]
         */

       Collection<String> ogrenciValueCollection= ogrenciMap.values(); //  Bir map'teki tum Value'leri bize Collection olarak dondurur.

        /*
        [ Ali-Can-10-H-MF,
        Veli-Cem-11-M-Soz,
        Ali-Cem-11-H-TM,
        Ayse-Can-10-H-MF,
        Ayse-Cem-11-M-TM,
        Fatma-Han-10-K-Soz]
         */
        /*
        Normalde bilgiler arasine Java ,  kullanir.
        Biz de virgul kullanabiliriz.Ancak bu durumda Value Collection'inin kac elemanli olduguna dikkat etmeliyiz.
        virgulle ayrilmis cok fazla element olabilir.
        Fakar value'ler TEK BIR STRING dir
         */
        System.out.println(ogrenciValueCollection.size()); // 6


    }
}
