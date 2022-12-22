package ders25_staticKeyword;

public class AHemsire {
    @Override
    public String toString() {
        return "AHemsire{" +
                "personelIsmi='" + personelIsmi + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                "\n hastane ismi='" + hastaneIsmi + '\'' +
                ", hastane adresi='" + hastaneAdresi + '\'' +
                ", bashekim ismi='" + bashekimIsmi + '\'' +
                '}';
    }

    static String hastaneIsmi="Yildiz Hastanesi";
    static String hastaneAdresi="Cankaya  / Ankara";
    static String bashekimIsmi="Dr. Mehmet Yilmaz";

    String personelIsmi="isim belirtilmedi";
    String personelAdresi="Adres belirtilmedi";
    String personelTelefon="Telefon belirtilmedi";



}
