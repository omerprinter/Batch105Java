package ders18_arrays;

public class C07_EnKisaEnUzunKelime {
    public static void main(String[] args) {

        // Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr={"Has","Ilker","Senturk","Omer Faruk"};
enUzunEnKisaYazdir(arr);

    }
    public static void enUzunEnKisaYazdir(String[] arr){

        String enuzunKelime=arr[0];
        String enukisaKelime=arr[0];

        for (int i =1; i < arr.length; i++) {

            if (arr[i].length()>=enuzunKelime.length()){
                enuzunKelime=arr[i];
            }
            if (arr[i].length()<=enukisaKelime.length()){
                enukisaKelime=arr[i];
            }


        }
        System.out.println("en uzun isim "+enuzunKelime);
        System.out.println("en kısa isim "+enukisaKelime);

    }


}
