package ders32_inheritanceConstructorCall;

public class GAvciKuslar extends FKuslar{
    public static void main(String[] args) {


        GAvciKuslar avci1=new GAvciKuslar();

        FKuslar avci2=new GAvciKuslar();

        EHayvanlar avci3=new GAvciKuslar();

        /*
        Bir child class ta obje olusturmak icin
        child class constructor'i kullanilir.

        Ama data turunu
         o objenin bagli oldugu class'lardan secebiliriz.

         Eger constructor ve data turu farkli scilirse
         bu durumda clas uyesi olan variable lar farkli davranislar gorterirler

         */


    }

}
