package ders11_stringManipulations;

public class C04_replaceAll {
    public static void main(String[] args) {

        // kullanıcının girdiği metinde harf dışında kalan tum karakterrleri temizleyen bir kod yazın
        // NOT: space silinmemeli.

        String input="Ja5+va cok 1*guzel";

        input=input.replaceAll("\\d","");
        input= input.replace(" ","5");
        input=input.replaceAll("\\W","");
        input=input.replace("5"," ");


        //input=input.replaceAll("\\W","");



        System.out.println(input);


    }
}
