package ders13_nestedForLoop_methodOlusturma;

public class C04_NestedForloop {
    public static void main(String[] args) {

        /*
        asagıdakı sekli yazdıran kod hazırlayın

        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *

         */

        for (int i = 1; i<=4; i++) {  // satırları kontrol eder
            for (int j = 1; j <=6; j++) {  //  sütunları kontrol eder
                System.out.print("* ");
            }
            System.out.println(""); // iç loop bitince alt satıra geç
        }
    }
}
