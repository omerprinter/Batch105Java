package ders17_scope;

public class C02_ClassVariables {
    // class level variable lar methodların dısında olurturulur
    // genel kullanım en ustte olusturulmalıdır

    static String hastaneIsmi="Yıldız Hastanesi";
    static int hastaSayisi=23453;
    static String basHekimIsmi;
    String persIsmi="isim girilmedi";
    String persTelefonu="tetefon girilmedi";
    int persYas;


    public static void main(String[] args) {
        System.out.println(hastaneIsmi); // Yıldız Hastanesi
        System.out.println(basHekimIsmi); // null  (ataması yapılmadığı için default degeri)
        //System.out.println(persIsmi); // static olmadıgından kullanılamaz
        /*
        Class level variable lara deger ataması yapılmamıs olursa Java bu variable lara
        data turune gore default olarak tanımlanan degerleri atar.
        default degerler:
        sayısal variabl lar :0
        boolean için: false
        char için : "" hiçlik
        objeler için string dahıl : null
         */
    }

    public static void method1(){
        System.out.println(hastaSayisi);
        hastaSayisi++;
       // System.out.println(persIsmi); // static scope dayız bu yüzden static olamayan kullanılamaz

    }
    public void method2(){
        System.out.println(hastaneIsmi);
        hastaSayisi++;
        System.out.println(persIsmi); // isim girilmedi  yazar
        System.out.println(persYas); // deger girilmediği için 0  yazar.
    }

}
