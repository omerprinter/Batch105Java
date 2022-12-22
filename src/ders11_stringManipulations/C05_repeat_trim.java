package ders11_stringManipulations;

public class C05_repeat_trim {
    public static void main(String[] args) {

        String str="java guzeldir ";
        System.out.println(str.repeat(4));

        str="  Java guzeldir  ";
        System.out.println(str.length()); // 19

        str=str.trim();

        System.out.println(str);
        System.out.println(str.length());

    }
}
