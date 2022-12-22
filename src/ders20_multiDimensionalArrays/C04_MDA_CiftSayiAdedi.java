package ders20_multiDimensionalArrays;

public class C04_MDA_CiftSayiAdedi {
    public static void main(String[] args) {

        // verilen 2 katlı bir int array daki çift sayi adedine bulan kod

        int[][] arr={{4,6},{3,5,8},{1,0,4}};

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]%2==0){   // arr[i][j]  tum elementeri gözden geciriyor demek
                    sayac++;
                }


            }
        }
        System.out.println("arraydaki cift sayi edei : "+sayac);

    }
}
