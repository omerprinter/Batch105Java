package ders11_stringManipulations;

public class C01_nullPointer {
    public static void main(String[] args) {

        String str1=""; // str1 e değer atanmıştır.
        System.out.println(str1); // hiclik
        System.out.println(str1.concat("Java")); // Java

        String str2; // str2 oluşturuldu ama değer atanmadı
        //System.out.println(str2);  // str2 ye değer atanmadığı için yazdırılamaz. CTE veriri

        //System.out.println(str2.concat("Java")); // değer atanmadığı için metodla kullanılamaz
        str2="Java candır";
        System.out.println(str2);
        System.out.println(str2.concat("."));

        String str3=null; // str3 e değer atanmamıştır.
        // null pointer ile javaya değer atamadığızın farkında olduğumuzu bildirmiş olduk
        System.out.println(str3); // null işaretlendiğini yazdırır.

        //System.out.println(str3.concat("Java"));

        System.out.println(str3+"Java");

        //System.out.println(str3.toUpperCase());


    }
}
