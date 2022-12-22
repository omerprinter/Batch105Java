package ders26_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList2 {
    public static void main(String[] args) {

        // Bir method olusturalim
        // method da yeni bir liste olusturun
        // Listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin
        // sonra sayilar listesine deger olarak yeni listi atayin
        // ve sayilar listini yazdirin.

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        yeniListDegeriAta(sayilar);

        System.out.println("method call dan sonra main method da sayilar : "+sayilar);

    }
    public static void yeniListDegeriAta(List<Integer> sayilar){
        // Bir method olusturalim
        // method da yeni bir liste olusturun
       List<Integer> yeniList=new ArrayList<>();

// Listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin
        for (int i = 0; i < sayilar.size(); i++) {
            yeniList.add(sayilar.get(i)+5);

        }// sonra sayilar listesine deger olarak yeni listi atayin
            sayilar=yeniList;
        System.out.println("method da sayilar listesinin son hali : "+sayilar);

    }
}
