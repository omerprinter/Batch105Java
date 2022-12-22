package ders03_datacastıngWrapperClass;

public class C05_WrapperClass {
    public static void main(String[] args) {

        int sayi=10;
        String str="Java cok guzel";

        /*
        primitive de method yoktur.
        bazı hazır methodların kullanılabilmesi için Wrapper class oluşturulmuş.

         */

        char krk='b';

        Character krkWrapper='c';

        System.out.println(Character.isLetter('5'));

        String str1="123";
        String str2="12";

        System.out.println(str1+str2);

        System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2));

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE);  // -32768



    }
}
