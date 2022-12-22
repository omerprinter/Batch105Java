package ders18_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] arr1={2,4,6,8,10};

// array ın bir elementini bulme
        System.out.println(arr1[2]); // 6 getirir ==> 0-1-2. index yanibaştan 3.

        arr1[3]=20;  // 4. indexe yani 10 a 20 atadık. 10 un yeni degeri 20 oldu.

        System.out.println(arr1[3]);

        System.out.println(arr1.length);

        // son elementi yazdırıma
        System.out.println(arr1[arr1.length-1]); // 10

        // array ın tum elementlerini yazın

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }

        // arrayın uzunlugu sonradan degıstırlemez
        // eger array da olmayan bir index e atama yapmak isterseniz
        // ArrayIndexOutOfBoundsException
        // bu hata CTE Compile Time Error degil
        //              Run  Tıme  Error dur.

      //  arr1[5]=35; // indez 5 demek 6. element demek fakat uzunlugu degıstıremedigimiz icin olmadı

    }
}
