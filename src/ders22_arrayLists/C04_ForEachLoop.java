package ders22_arrayLists;

public class C04_ForEachLoop {
    public static void main(String[] args) {

        int []arr={3,5,7,8,4,2,9,6,4,5};
        // bu array daki 5 deb buyuk olan tum elementleri toplayabilme
        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>5){
                toplam+=arr[i];
            }

        }
        System.out.println("for loop ile topla : "+toplam);

        // for-each loop ile yapalim
        // 3 seyi soylememiz lazim.
        // 1- hangi data turu degiskeniyle ugrasilacak
        // 2- loop un icerinde her eleman geldiginde hangi isimle islem yapacaksiniz
        // 3- hangi array veya collection dan elemanlar gelecek.
        toplam=0;

        for (int each:arr   // arr ye gir herbir int i bana getir.
             ) {
            if (each>5){
                toplam+=each;
            }
        }
        System.out.println("for-each loop ile toplam : "+toplam);
    }
}
