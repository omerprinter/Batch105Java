package ders07_nestedIfElseStatement;

public class C05_IfElseIfStatement {
    public static void main(String[] args) {

        // kullanıcıdan aldığı ürün adedi ve liste fiyatını alın,
        // kullanıcıya müşteri kartı olup olmadığını sorun
        // müşteri kartı varsa 10 üründen fazla alırsa %20 indirim yoksa % 15 indirim yapın
        // müşteri kartı yoksa 10 üründen fazla alırsa %15, yoksa %10 indirim yapın.

        int urunAdedı=25;
        boolean kartVarMi=true;
        double listeFiyatı=20;
        double toplamFıyat=0;

        // ana değişken kart olsun
        if (kartVarMi){
            //kart var
            if (urunAdedı<0 ){
                System.out.println("hatalı ürün adedi girişi");
            } else if (urunAdedı<10) {
                toplamFıyat=urunAdedı*listeFiyatı*0.85;
                System.out.println("% 15 indirimli fiyat "+toplamFıyat+" tl");
            }else {
                toplamFıyat=urunAdedı*listeFiyatı*0.80;
                System.out.println("% 20 indirimli fiyat "+toplamFıyat+" tl");
            }

        }else{
            //kart yok
            if (urunAdedı<0 ){
                System.out.println("hatalı ürün adedi girişi");
            } else if (urunAdedı<10) {
                toplamFıyat=urunAdedı*listeFiyatı*0.90;
                System.out.println("% 15 indirimli fiyat "+toplamFıyat+" tl");
            }else {
                toplamFıyat=urunAdedı*listeFiyatı*0.85;
                System.out.println("% 20 indirimli fiyat "+toplamFıyat+" tl");
            }
        }

    }
}
