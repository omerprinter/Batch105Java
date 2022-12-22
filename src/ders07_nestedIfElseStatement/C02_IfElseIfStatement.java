package ders07_nestedIfElseStatement;

public class C02_IfElseIfStatement {
    public static void main(String[] args) {
        // kullanıcıdan aldığı ürün adedi ve liste fiyatını alın,
        // kullanıcıya müşteri kartı olup olmadığını sorun
        // müşteri kartı varsa 10 üründen fazla alırsa %20 indirim yoksa % 15 indirim yapın
        // müşteri kartı yoksa 10 üründen fazla alırsa %15, yoksa %10 indirim yapın.

        int urunAdedı=30;
        boolean kartVarMi=true;
        double listeFiyatı=12.5;
double toplamFıyat=0;


        if (kartVarMi==true && urunAdedı>=10){
            toplamFıyat= urunAdedı*listeFiyatı* (0.8);
            System.out.println("% 20 indirimli fiyat : "+toplamFıyat);
        } else if (kartVarMi==true && urunAdedı<10 && urunAdedı>0){
            toplamFıyat= urunAdedı*listeFiyatı* (0.85);
            System.out.println("% 15 indirimli fiyat : "+toplamFıyat);{

      } //else if (!kartVarMi==false && urunAdedı>=10){
      //        toplamFıyat= urunAdedı*listeFiyatı* (0.85);
      //        System.out.println("% 15 indirimli fiyat : "+toplamFıyat);
      //    else if (!kartVarMi==false && urunAdedı<10 && urunAdedı>0) {
      //        toplamFıyat= urunAdedı*listeFiyatı* (0.9);
      //        System.out.println(" % 10 indirimli fiyatı : " +toplamFıyat);
      //    }else {
      //        System.out.println("geçersiz");
        }

        }
}
