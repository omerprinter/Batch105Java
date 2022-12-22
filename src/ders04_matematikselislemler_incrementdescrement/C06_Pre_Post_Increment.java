package ders04_matematikselislemler_incrementdescrement;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {

        int a=10;

// a variable nın değerini yazdırıp sonra a nın değerini bir artırın.

        System.out.println("a : "+a); // 10
        a++; // 11


        int b=10;
        // a variable nın değerini 1 artırıp sonra yazdırın

        b++;
        System.out.println("b : "+b);

        int c=10;
        // c variablenin değerini yazdırıp sonra 1 artırın

        System.out.println("c : "+ c++);
        int d=10;
        // 1 artırıp yazdırın
        System.out.println("d : "+ ++d);

    }
}
