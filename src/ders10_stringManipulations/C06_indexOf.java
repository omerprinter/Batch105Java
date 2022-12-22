package ders10_stringManipulations;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); // 9  ilk "a" nın indeksini yazdırır
        System.out.println(str.indexOf('c')); // 8
        System.out.println(str.indexOf("hersey")); // 15  - bloğun basladığı index

        System.out.println(str.indexOf("e",9));


        // 13. index teki e den bir sonraki e nin index i
        System.out.println(str.indexOf("e",14));

        // cümledeki ikinci c'nin index ini yazdırın
        int ilkcindex=str.indexOf("c"); // 8
        System.out.println(str.indexOf("c",ilkcindex+1)); // 22

        System.out.println(str.indexOf("ali")); // index olarak int döndürmesi lazım
        System.out.println(str.indexOf("x"));


    }
}
