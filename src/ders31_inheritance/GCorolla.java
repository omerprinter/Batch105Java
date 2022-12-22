package ders31_inheritance;

public class GCorolla extends FToyota{

    String model="Corolla";
    String uretimYeri="Turkiye";

    GCorolla(){
        System.out.println("Corolla cons. calisti");
    }

    public static void main(String[] args) {

        GCorolla corolla1=new GCorolla();
        System.out.println(corolla1.marka); //  Toyota


    }
}
