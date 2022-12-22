package ders18_arrays;

public class C05_ArraydeElemanArama {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve
        varsa kac kere kullanildigini yazdiran bir method olusturun.
         */
        int[] arr={1,2,4,5,3,6,7,4,2,3,5,1,3,2};

        int arananEleman=2;

        elemanAra(arr,arananEleman); // Aranan 2 sayisi, array da 3 kere kullanılmıs

    }
    public static void elemanAra(int[] arr, int arananEleeman){

        int sayac=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==arananEleeman){
                sayac++;
            }

        }
        if (sayac==0){
            System.out.println("Aranan sayi array da yok");
        }else {
            System.out.println("Aranan "+arananEleeman+" sayisi, array da "+sayac+" kere kullanılmıs");
        }
    }
}
