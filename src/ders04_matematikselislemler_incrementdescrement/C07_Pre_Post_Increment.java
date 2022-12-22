package ders04_matematikselislemler_incrementdescrement;

public class C07_Pre_Post_Increment {
    public static void main(String[] args) {

        int a=10;

        int b=a++;  //b=10 ,  a=11


        int c=++b; // c=11 ,  b=11

        System.out.println("a : "+a+", b : "+b+", c : "+c); // 11,11,11


        a=20;
        b=++a; // b=21 , a=21
        c=a++; // c=21  a=22

        System.out.println("a : "+a+", b : "+b+", c : "+c); // 22,21,21

            a=30;
        System.out.println(a++); // 30
        System.out.println(--a); // 30
        System.out.println(a--); // 30
        System.out.println(a); //  29


    }
}
