package ders10_stringManipulations;

import java.util.Scanner;

public class C07_Soru {
    public static void main(String[] args) {
        // kullanıcıdan bir cümle ve bir metin alın
        // cümlede metnin durumuna göre
        // 1-cümle metni içermiyor
        // 2-cümle metni sadece 1 kere içeriyor
        // 3-cümle metni birden fazla içeriyor
        // seçeneklerinden uygun olanı yazdırın.

        String cumle="Java cok guzeldir cok.";
        String metn="ilker";

        if (!cumle.contains(metn)){  // cümle metni içermiyor mu dedik
            System.out.println("cümle metni içermiyor");
        }else {
            int ilkindex=cumle.indexOf(metn); //

            int ikinciindex=cumle.indexOf(metn,ilkindex+1); // ya -1 ya da bir index
            if (ikinciindex==-1){
                System.out.println("cümle metni sadece 1 kere içeriyor");
            }else {
                System.out.println("cümle metni birden fazla içeriyor");
            }


        }


    }
}
