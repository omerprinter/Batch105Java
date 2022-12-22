package ders10_stringManipulations;

public class C09_soru {
    public static void main(String[] args) {
        // kullanıcıdan bir cümle ve bir metin alın
        // cümlede metnin durumuna göre
        // 1-cümle metni içermiyor
        // 2-cümle metni sadece 1 kere içeriyor
        // 3-cümle metni birden fazla içeriyor
        // seçeneklerinden uygun olanı yazdırın.

        String cumle="Java cok guzeldir cok.";
        String metn="cok";

        int ilkindex=cumle.indexOf(metn);
        int sonindex=cumle.lastIndexOf(metn);

        if (ilkindex==(-1)){
            System.out.println("cümle metni içermiyor");
        } else if (ilkindex==sonindex) {
            System.out.println("cümle metni sadece 1 kere içeriyor");
        }else {
            System.out.println("cümle metni birden fazla içeriyor");
        }

    }
}
