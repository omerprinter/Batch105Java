package ders46_Maps;

import ders44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C03_SoyIsimleriBuyukHarfYap {
    public static void main(String[] args) {

        // ogrenci map'teki soy isimleri buyuk harfe cevirip map'e donduren mehod olusturun

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        ogrenciMap.put(109,"Adem-Demir-11-D-Soz");

        ogrenciMap=MapDepo.soyisimleriBuyukHarfYap(ogrenciMap);

        System.out.println(ogrenciMap);
        /*
        {101=Ali-CAN-10-H-MF,
        102=Veli-CEM-11-M-Soz,
        103=Ali-CEM-11-H-TM,
        104=Ayse-CAN-10-H-MF,
        105=Ayse-CEM-11-M-TM,
        106=Fatma-HAN-10-K-Soz,
        109=Adem-DEMİR-11-D-Soz}
         */



    }
}
