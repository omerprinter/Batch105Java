package ders05_concatenation_Operators;

public class C01_Concatanetıon_Operators {
    public static void main(String[] args) {

        // sadece aşağıda verilen variable ları kullanarak istenenleri yazdırın

        String s1="Java";
        String s2="Guzeldır";
        String s3="";
        String s4=" ";
        int sayı1=4;
        int sayı2=3;

        System.out.println(s1+s4+s2+(4+3)); // Java Guzeldir7
        System.out.println(s1+s4+s2+s4+sayı1*sayı2); //Java Guzeldır 12
        System.out.println(sayı1+sayı2+s1+s4+s2);  // 7Java Guzeldır
        System.out.println(s3+sayı2+sayı1+s2+s4+s1); // 34Guzeldır Java
        System.out.println(s3+sayı2+sayı1+s4+s1); // 34 Java
        System.out.println(s1+(sayı2+sayı1)+s4+s2+sayı1+sayı2);

    }

}
