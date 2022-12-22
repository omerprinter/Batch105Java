package ders44_maps;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {

       Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
       /*
       {101=Ali-Can-10-H-MF,
       102=Veli-Cem-11-M-Soz,
       103=Ali-Cem-11-H-TM,
       104=Ayse-Can-10-H-MF,
       105=Ayse-Cem-11-M-TM,
       106=Fatma-Han-10-K-Soz}
        */

        System.out.println(ogrenciMap);

       ogrenciMap.put(110,"Fatih-Yan-10-T-MF");
       // 102 nolu ogrenciyi update edelim

        ogrenciMap.put(102,"Veli-Dem-12-D-Soz");

        System.out.println(ogrenciMap);

        // 103 nolu ogrencinin isim soyismi
        System.out.println(MapDepo.isimSoyisimDondur(ogrenciMap, 103)); //Ali Cem

        //105 nolu ogrencinin subesini S  yapin

        ogrenciMap=MapDepo.ogrenciyeYeniSubeAta(ogrenciMap, 105, "S");
        System.out.println(ogrenciMap);

        /*
        +{101=Ali-Can-10-H-MF,
        102=Veli-Dem-12-D-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-S-TM,
        106=Fatma-Han-10-K-Soz,
        110=Fatih-Yan-10-T-MF}
         */

    }
}
