package ders31_inheritance;

public class CSuv extends BinekArac{
    public static void main(String[] args) {

        CSuv suv1=new CSuv();
        System.out.println(suv1.marka); // Binek araclarin markasi vardir
        System.out.println(suv1.model); // Binek araclarin modeli olur
        System.out.println(suv1.motor); // Tum araclar motor kullanir
        System.out.println(suv1.plaka); // Tum araclar plaka kullanir
        System.out.println(suv1.yakit); // Araclar farkli kullanir
        System.out.println(suv1.yil);   // 1990
        suv1.hiz(); // binek araclarin hizi modele gore degisir
        suv1.teker(); // binek araclarin 4 tekeri vardir

        CSuv suv2=new CSuv();
        suv2.marka="Toyota";
        suv2.model="Rav4";
        suv2.motor="1.6";
        suv2.plaka="06 ANK 006";
        suv2.yakit="benzin";
        suv2.yil=2012;
        suv2.hiz(suv2.yakit);

    }

    public void hiz(String yakit){
        if (yakit.equalsIgnoreCase("benzin")){
            System.out.println("Benzinli SUV lar max 300 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("Dizel")) {
            System.out.println("Dizel SUV lar max 240 km hiz yapar");
        }else if (yakit.equalsIgnoreCase("Hibrit")) {
            System.out.println("Hibrit SUV lar max 220 km hiz yapar");
        }else {
            System.out.println("yakit belli degill max hiz soyleyemem");
        }

    }


}
