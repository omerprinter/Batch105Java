package ders23_constructors;

public class DAraba {
    // bir proje olusturulurken tum class larda main method olmasına gerek yoktur
    // Biz de bu class ı araba objeleri icin bir depo olarak dizayn edelim.

    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;

    @Override
    public String toString() {
        return "Araba Ozellikleri" +
                "\nmarka= " + marka +
                "\nmodel= " + model +
                "\nyakit= " + yakit +
                "\nyil=" + yil +
                "\nfiyat=" + fiyat;
    }

    int fiyat;


    public int maxHiz(String yakit){
        int maxHiz=120;

        if (yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=100;
        }
        return maxHiz;

    }

}
