package ders32_inheritanceConstructorCall;

public class Corolla extends BToyota {

    Corolla(int pc){
        super(5);
        System.out.println("Parametreli Toyota Constructor");
    }
    Corolla(){

    }
    Corolla (String str){
        this();
        System.out.println("String parametreli Corolla constructor");
    }

    public static void main(String[] args) {

        Corolla corolla3=new Corolla("Ilker");

        System.out.println("==========");
        Corolla corolla1=new Corolla();
        //Parametresiz Araba Constructor
        //Parametresiz Toyota Constructor
        System.out.println("==========");

        Corolla corolla2=new Corolla(3);

    }
}
