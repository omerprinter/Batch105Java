package ders14_method_olusturma;

public class C05_SubstringOlustur {
    /*
    Soru 1- Kullanicidan input olarak verilen bir String alın,
    baslangic ve bitis indexlerine gore
    baslangic index’i dahil, bitis index’i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
 - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
 - kullanici str’da olan index’lerden daha buyuk bir index girerse hata mesaji yazdirin.
     */
    public static void main(String[] args) {

        String input="Java ne kadar guzel";
        int basIndex=5;
        int bitisIndex=7;

        kendiSubstringMethodumuz(input,basIndex,bitisIndex);        // ne
        kendiSubstringMethodumuz("Java",1,3); //av
        kendiSubstringMethodumuz("Deneme",6,3); //Baslangıc indexi bitis indeksinden buyuk olamaz
        kendiSubstringMethodumuz("Java",6,8); //Bitis indexi Stringin sınırları dısında

    }

    public static void kendiSubstringMethodumuz(String input,int basIndex,int bitisIndex){

        if (basIndex>bitisIndex){
            System.out.println("Baslangıc indexi bitis indeksinden buyuk olamaz");
        } else if (bitisIndex>=input.length()) {
            System.out.println("Bitis indexi Stringin sınırları dısında");
        }else {
            for (int i = basIndex; i <bitisIndex ; i++) {
                System.out.print(input.charAt(i));
            }
            System.out.println("");
        }

    }
}
