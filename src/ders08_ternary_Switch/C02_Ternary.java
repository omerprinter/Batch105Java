package ders08_ternary_Switch;

public class C02_Ternary {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="Alİ";
        // verilen iki metin biribiri ile aynı ise
        // metinler ay
        // farklı ise metinler farklı yazdırın.


        if (str1.equals(str2)){
            System.out.println("metinler aynı");
        }else {
            System.out.println("metinler faklı");
        }

        System.out.println(str1.equals(str2)? "metinler aynı": "metinler farklı");

    }
}
