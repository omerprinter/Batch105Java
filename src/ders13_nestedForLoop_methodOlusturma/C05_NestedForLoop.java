package ders13_nestedForLoop_methodOlusturma;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        /*
        nested for loop kullanarak aşağıdaki sekli yapın

         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5

         */

        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

    }
}
