package ders09_string_manipulations;

public class C04_charAt {
    public static void main(String[] args) {

        String str="Java Candır";
        System.out.println(str.charAt(0));

        System.out.println(str.charAt(5)); // 5. indeksteki char
        System.out.println(str.charAt(10)); // bana sonuncu karakteri yazdrın r==> 10. karakter


    /*
    bir metindeki karakter sayısı ile son index arasında 1 fark olur 0 dan başalandığı için
     */
        System.out.println(str.length());


    }
}
