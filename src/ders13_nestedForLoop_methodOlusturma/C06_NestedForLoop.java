package ders13_nestedForLoop_methodOlusturma;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        nested for loop kullanarak aşağıdaki sekli yapın

         1
         2 4
         3 6 9
         4 8 12 16
         5 10 15 20 25

         */

        for (int i = 1; i <=5 ; i++) {  // sattırı kaontrol eder
            for (int j = 1; j <=i ; j++) {   // sütunu kontrol eder

                System.out.print(i*j+" "); // satır * sutun demek

            }
            System.out.println("");
        }
/*
            1                           1
           2 2                          2 2
          3 3 3                         3 3 3
         4 4 4 4
        5 5 5 5 5
 */
        for (int i = 1;i<=5 ; i++) {
            for (int j = 1; j <=5-(i+1) ;j++ ) {
                System.out.print(" ");
            }
            System.out.println("");
        }


    }
}
