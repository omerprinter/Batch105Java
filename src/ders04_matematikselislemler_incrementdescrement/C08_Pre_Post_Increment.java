package ders04_matematikselislemler_incrementdescrement;

public class C08_Pre_Post_Increment {
    public static void main(String[] args) {

        int x=3;

        int y=2* ++x; // y=8 ,x=4

        int z=5 + y--;  // z=13  ,  y=7  ,  x=4

       // System.out.println(x+y+z); //  24

        int a=10;
        int b=a++;
        System.out.println(a);
        System.out.println(b);



    }
}
