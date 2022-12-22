package ders30_Encapsulation;

public class C01_Encapsulation {
    public static void main(String[] args) {

        AEncapsuleClass pers1=new AEncapsuleClass();

       // pers1.hastaneAdi="Java hastanesi;"  private oldugu icin gorunmez
        //pers1.hastaUcreti=1000;  private oldugu icin gorunmez

       // pers1.hemsireAdresi="Ankara";  private oldugu icin gorunmez
       // pers1.hemsireIsmi="Yildiz Yildiz"; private oldugu icin gorunmez

        System.out.println(pers1.getHastaneIsmi()); // Yildiz Hastanesi .. gorunur atama yapilmaz

        pers1.setHastaUcreti(500); // sadece deger atar. gorunmez

        System.out.println(pers1.getHemsireAdresi());
        pers1.setHemsireAdresi("Istanbul");

        System.out.println(pers1.getHemsireIsmi());


    }
}
