package ders36_checkedExeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("src/ders36_checkedExeptions/Deneme.txt");

        FileOutputStream fos=new FileOutputStream("src/ders36_checkedExeptions/Deneme.txt");

        //Java ile bilgisayarimizdaki bir dosyaya ulasmak icin
        // ==> FileInputStream <====  clasindan obje olustururuz
        //
        // fis(FileInputStream) olustururken dosya yolunu parametre olarak girmeliyiz
        // deneme sag tikla==>copy/path/referace==>Path from content Root.

        /*
        Checked exception olustuma ıhtımalı olan kodları  yazdıgımızda
     Java Compıle Tıme orada bır hata ıhtımalı oldugunu gorur
      ve kodun altını kırmızı olarak çızer

      bu durumda kırmızı çizgiyi kaldırmak için 2(iki) yöntem vardır.
      1- Exception'u TRY CATCH blogu ile handle etmek
      2- Java'ya sorun ihtimalinin farkında olduğumuzu ama kodumuza güvendiğimizi ve
      çalışmaya devam etmesini istediğimizi söylemek
      bunun için method signature'a method declarasyonu ile curly braces arasına throws keyword
      ve beklenen exceptıon turu yazılabilir

     */


    }
}
