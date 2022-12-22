package ders10_stringManipulations;

public class C05_Soru {
    public static void main(String[] args) {

        /*
        mail kontrolü yapan bir program hazırlayın
        1- mail @ işareti içermiyorsa geçersiz e-mail yazdırın
        2-@ işareti var ama @gmail.com içermiyorsa "gmail adresi giriniz" yazdırın
        3- @gmail.com ile bitmiyorsa "yazım hatası" olarak yazdırın
         */

        String email="ahmet@gmail.com";

        if (!email.contains("@")){

            System.out.println("geçersiz email");

        } else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("yazım hatası");
        }else {
            System.out.println("e mail başarı ile kaydedildi");
        }

    }
}
