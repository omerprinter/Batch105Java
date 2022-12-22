package ders44_maps;

import java.util.*;

public class MapDepo {

    // ogrenci map olusturup bize donduren bir method olusturun
    public static Map<Integer,String> ornekMapOlustur(){
        Map<Integer,String> ogrenciMap=new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");

        return ogrenciMap;

    }

    public static String isimSoyisimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {

        String ogrenciValue=ogrenciMap.get(ogrenciKey); //  Ayse-Cem-11-M-TM
        String []valueArr=ogrenciValue.split("-"); // [Ayse, Cem, 11, M, TM]

        String isimSoyisim=valueArr[0]+" "+valueArr[1]; // Ayse Cem

        return isimSoyisim;
    }

    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey,String yeniSube) {

        if (ogrenciMap.containsKey(ogrenciKey)) {
            // istenen key varsa update edilecek

            String istenenKeyinValuesu = ogrenciMap.get(ogrenciKey); //  Ayse-Can-10-H-MF
            String[] istenenKeyValueArr = istenenKeyinValuesu.split("-"); // [Ayse, Can, 10, H, MF]
            // yeni sube degerini atayalim
            istenenKeyValueArr[3] = yeniSube; // [Ayse, Can, 10, K, MF]

            String istenenKeyinYeniValuesu = istenenKeyValueArr[0] +
                    "-" + istenenKeyValueArr[1] + "-" +
                    istenenKeyValueArr[2] + "-" +
                    istenenKeyValueArr[3] + "-" +
                    istenenKeyValueArr[4];
            ogrenciMap.put(ogrenciKey, istenenKeyinYeniValuesu);
        }
        return ogrenciMap;
    }

    public static void subeOgrenciBilgileriniYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {
        Collection<String> valueCollection =ogrenciMap.values();
        System.out.println("isim  soyisim  sinif");
        System.out.println("===================");
        for (String eachValue:valueCollection) {
            //value yu parcala,
            String[] valueArr=eachValue.split("-"); // [Ayse, Can, 10, H, MF] gibi

            // subeyi kontrol et, istenen sube ise  isim-soyisim-sinif  yazdir
            if (valueArr[3].equals(subeAdi)){
                System.out.printf("%-6s %-8S %-4s\n",valueArr[0],valueArr[1],valueArr[2]);
            }
        }
    }

    public static List<String> numaraDegerineGoreListeOlustur(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {
    // hem key hem de value lazim oldugundan ikisini de bu method'da olusturalim
        Set<Integer> ogrenciKetSeti =ogrenciMap.keySet();

        // dondurecegimiz listeyi olusturduk
        List<String> isimListesi=new ArrayList<>();

        //key degerlerini elden gecirip istenen araliktakileri bulalim
        String value;
        String[] valueArr;
        String istenenIsim;
        for (Integer eachKey:ogrenciKetSeti) {
            if (basNo<=eachKey && eachKey<=bitNo){
                // verilen sinir dgerlerine uyan eachKey'ler gelecek

                // sinira uygun keyin value sunu aldik
                value=ogrenciMap.get(eachKey); //  Ayse-Can-10-H-MF
                //valuyu parcalara ayirdik
                valueArr=value.split("-"); //  [Ayse, Can, 10, H, MF]
                // listee eklenecek bilgiler
                istenenIsim=valueArr[0]+" "+valueArr[1]+" "+valueArr[4];

                // istenen ismi listeye ekleyelim
                isimListesi.add(istenenIsim);

            }
        }
        return  isimListesi;
    }

    public static void numaraIsinSoyisimYazdir(Map<Integer, String> ogrenciMap) {

        Set<Integer> keySeti=ogrenciMap.keySet();
        String value;
        String[] valueArr;

        for (Integer eachKey:keySeti) {
            value=ogrenciMap.get(eachKey);
            valueArr=value.split("-"); // [Ayse, Can, 10, H, MF]

            System.out.println(eachKey+" "+valueArr[0]+" "+valueArr[1]);
        }

    }

    public static Set<String> siraliOgrenciListesiOlustur(Map<Integer, String> ogrenciMap) {
        Set<String> siraliOgrenciSeti=new TreeSet<>();
        // tum elementlerin key ve value'lerine birlikte ihtiyac oldugundan
        // Entry kullanmaliyiz

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti =ogrenciMap.entrySet();

        // herbir entry'yi elden gecirip bilgileri istedigimiz formatta alalim
        String istenenBilgi;
        String value;
        String[] valueArr;

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySeti) {
            //101=Ali-Can-10-H-MF  Entry
            // bolum  - sinif  - sube  - isim  - soyisim  - numara
            value=eachEntry.getValue();
            valueArr=value.split("-");

            istenenBilgi=valueArr[4]+", "+valueArr[2]+", "+valueArr[3]+", "+
                         valueArr[0]+" "+valueArr[1]+", "+eachEntry.getKey();

            siraliOgrenciSeti.add(istenenBilgi);
            // map'te herhangibir degiisiklik istenmediginden array'i yeniden birlestirip entry.setValue() 'e gerek yok

        }
        return siraliOgrenciSeti;
    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {




        // array'de yeni bilgileri birlestirip eachEntry.setValue(yeniValue)
        String istenen;
        String value;
        String[] valueArr;
        // soyisimleri buyutnek icin Entry set alalim
        Set<Map.Entry<Integer,String>> ogrenciEnrtySeti=ogrenciMap.entrySet();
        // entrySet'teki herbir entry'i deki value'yu alalim
        for (Map.Entry<Integer,String> eachEntry:ogrenciEnrtySeti ) {
            value=eachEntry.getValue();
            // value'yu split yapip array'e cevirelim
            valueArr=value.split("-"); // [Ayse, Can, 10, H, MF]
            // array'de istenen degisikligi yapalim
            valueArr[1]=valueArr[1].toUpperCase();
            // array'de yeni bilgileri birlestirip eachEntry.setValue(yeniValue)
            eachEntry.setValue(valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4]);

        }

        return ogrenciMap;
    }
}