package ders12_forLoops;

public class C04_RakamlarToplamı {
    public static void main(String[] args) {

        // kullanıcının verdiği sayının rakamlar toplamı

        long sayi=66944545411l;
        String sayiStr=""+sayi;
        System.out.println(sayiStr.length());


        long birler=0;
        long rakamlarTop=0;

        for (int i = 1; i <=sayiStr.length() ; i++) {
            birler=sayi%10;
            rakamlarTop=rakamlarTop+birler;
            sayi=sayi/10;

        }
        System.out.println(rakamlarTop);

    }
}
