package ders28_varargs_stringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java Guzeldir");

        System.out.println(sb.deleteCharAt(2));

        System.out.println(sb.indexOf("a")); //   1  ilk buldugu anın indexi

        System.out.println(sb.indexOf("a", 2)); // 2. indexten itibaren  a  ara
    }
}
