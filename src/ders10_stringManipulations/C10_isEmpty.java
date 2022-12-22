package ders10_stringManipulations;

public class C10_isEmpty {
    public static void main(String[] args) {

        String str="";

        System.out.println(str.isEmpty());

        str="  ";

        System.out.println(str.isEmpty()); //false
        System.out.println(str.isBlank()); // true --- boşluklardan mı oluşuyor demek

        str="x";
        System.out.println(str.isEmpty()); //false
        System.out.println(str.isBlank()); // true


    }
}
