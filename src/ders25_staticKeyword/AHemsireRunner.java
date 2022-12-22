package ders25_staticKeyword;

public class AHemsireRunner {

    public static void main(String[] args) {

        AHemsire h1=new AHemsire();
        h1.personelIsmi="Ayse";
        h1.personelAdresi="Ulus";
        h1.personelTelefon="312211456";
        System.out.println(h1);

        AHemsire h2=new AHemsire();
        System.out.println(h2);
        h2.personelIsmi="Hatice";
        h2.personelAdresi="Sincan";
        h2.personelTelefon="3122245565";
        h2.bashekimIsmi="Yasar Kemal"; // bu satırdan itibaren tum objeler icin olur
        // Static member 'ders25_staticKeyword.
        // AHemsire.bashekimIsmi' accessed via instance reference


        System.out.println("h1 :"+h1);
        System.out.println("h2: "+h2);

        AHemsire h3=new AHemsire();
        System.out.println("h3 :"+h3);
        h3.hastaneIsmi="Java Hastanesi";

        System.out.println(h2.hastaneIsmi); // Java Haastanesi

    }
}
