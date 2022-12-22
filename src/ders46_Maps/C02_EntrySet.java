package ders46_Maps;

import ders44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {
        // ogrenci map'inde sirali olarak tum ogrencilern
        // bolum  - sinif  - sube  - isim  - soyisim  - numara       yazdirin

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        ogrenciMap.put(109,"Adem-Demir-11-D-Soz");

        //  Soz, 11, D, Adem Demir, 109
        // bu formatta strinler olusturup bir treeSet 'e atayan ve bu set' i bize donduren bir method olusturalim

        Set<String> siraliOgrenciListesi = MapDepo.siraliOgrenciListesiOlustur(ogrenciMap);
        System.out.println(siraliOgrenciListesi);
        /*
            [
            MF, 10, H, Ali Can, 101,
            MF, 10, H, Ayse Can, 104,
            Soz, 10, K, Fatma Han, 106,
            Soz, 11, D, Adem Demir, 109,
            Soz, 11, M, Veli Cem, 102,
            TM, 11, H, Ali Cem, 103,
            TM, 11, M, Ayse Cem, 105]
         */

    }
}
