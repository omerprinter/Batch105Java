package ders07_nestedIfElseStatement;

public class C03_IfElseIfStatement {
    public static void main(String[] args) {
       // Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
// Erkek 65 yas ve uzeri emekli olabilir.
// Cinsiyet ve yasini dikkate alarak
// "Emekli olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.

        char cinsiyet='e';
        int yas=56;


        // nested if-else şeklinde kullanım için
        // önce ana değişkeni seçip ona göre ana yapıyı oluşturun
        // cinsiyet ana değişkeni olsun.

      if (cinsiyet=='k'||cinsiyet=='K'){
          if (yas<15){
              System.out.println("hatalı yaş girişi");
          } else if (yas<60) {
              System.out.println("emekli olamazsın daha "+(60-yas)+" yıl çalışmalısın");
          }else {
              System.out.println("Emekli olabilirsin.");
          }

      } else if (cinsiyet=='e'||cinsiyet=='E') {
          if (yas<15){
              System.out.println("hatalı yaş girişi");
          } else if (yas<65) {
              System.out.println("emekli olamazsın daha "+(65-yas)+" yıl çalışmalısın");
          }else {
              System.out.println("Emekli olabilirsin.");
          }
      }else {
          System.out.println("Yanlış cinsiyet girişi yaptınız.");
      }


    }
}
