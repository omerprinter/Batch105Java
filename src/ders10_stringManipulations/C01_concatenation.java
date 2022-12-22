package ders10_stringManipulations;

public class C01_concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzeldır";
        boolean bl=true;
        int sayi=20;
        double dbl=3.54;

        System.out.println(str1+bl+sayi);
        //System.out.println(bl+sayi);

        System.out.println(sayi+dbl);

       // System.out.println(str1.concat(bl));

        System.out.println(str1.concat(" ").concat(str2));
        System.out.print(str1+" "+str2);
    }
}
