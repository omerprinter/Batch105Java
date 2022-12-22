package ders45_Maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public static void main(String[] args) {

        // verilen cumlede her harfi
        // ve o harfein kullanim miktarini
        // A=5 , b=3... gibi yazdirin

        String str="Javayi balonu patlatmadan bitirelim";
        // J=1 , a=7 , v=1 , y=1 ....

        String[] harflerArr=str.split("");
        // [J, a, v, a, y, i,  , b, a, l, o, n, u,  , p, a, t, l, a, t, m, a, d, a, n,  , b, i, t, i, r, e, l, i, m]

        Map<String,Integer> kullanimMiktarlariMap=new TreeMap<>();
        int sayac=1;

        // 1- tum harfleri sirasi ile ele alacagiz.
        for (int i = 0; i < harflerArr.length ; i++) {

            // 2- ele aldigimiz harfin, daha once Map'a ekelenip eklenmedigini kontrol edelim
            if (kullanimMiktarlariMap.containsKey(harflerArr[i])){
                continue;
            }else {
                // kod buraya geldiyse o harf henuz Map'a eklenmemistir.
                // o zaman bu harfin kullanim miktrini bulmaliyiz
                for (int j = i+1; j < harflerArr.length ; j++) {
                    if (harflerArr[j].equals(harflerArr[i])){
                        sayac++;
                    }
                }
                // sayma islemi bitti  Key ve Value yu Map'a ekleyelim
                kullanimMiktarlariMap.put(harflerArr[i],sayac);
                sayac=1;
            }

        }
        System.out.println(kullanimMiktarlariMap);
        // { =3, J=1, a=7, b=2, d=1, e=1, i=4, l=3, m=2, n=2, o=1, p=1, r=1, t=3, u=1, v=1, y=1}
    }
}
