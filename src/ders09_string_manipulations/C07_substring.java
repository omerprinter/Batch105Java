package ders09_string_manipulations;

public class C07_substring {
    public static void main(String[] args) {

        String str="Java gun gectıkce guzellesıyor";

        System.out.println(str.substring(5,8));
// 5. indexten baslar (8-5) karakter yazdırır
        // 5. dahil - 8. hariç
        System.out.println(str.substring(9,17)); // gectıkce

        System.out.println(str.substring(3,7)); // a gu   yazdırır

        String isim="husEYıN";
        // verilen ismin ilk harfi büyük gerisi küçük harf olarak yazdırın

        isim=isim.substring(0,1).toUpperCase()+ // ilk harfi alıp büyük harf yaptık
                isim.substring(1).toLowerCase(); // 1. index ve sonrasını alıp küçük harf yaptı
        System.out.println(isim); // üst satırda atama yaptığımızdan Huseyın oldu

        System.out.println(isim.substring(2,5)); //sey

        // sadece 3. indexteki yazdırın sadece e yi yazdırın
        System.out.println(isim.substring(3,4)); // e
        System.out.println("zor sorunun cevabı :"+isim.substring(2,2));
        // System.out.println(isim.substring(5,2)); //  YAZMAZ


    }
}
