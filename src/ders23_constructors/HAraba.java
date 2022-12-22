package ders23_constructors;

public class HAraba {
    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public HAraba(String mrk,String mdl,String ykt,int yl,int fyt){

        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;

    }

    public HAraba(String mrk,String mdl,int yl){
        // istersek parametreleri azaltarak da constructor olusturabiliriz
        marka=mrk;
        model=mdl;
        yil=yl;

    }

    public HAraba(){
        // gorunur durumdaki parametresiz constructor
        // default constructor DEGİLDİR
        // dEFAULT constructor IN BODY Sİ DE BOS OLUR
        // ancak parametresiz constructor da body e kod yazilabilir
        //
        // parametresiz constructor in bodysinde kod yoksa
        // default constructor ile aynı islevi gorur
        // ama yine de gorunur ise default constructor DENMEZ.

    }
    // gozle gorulur herhangibir constructor olusturdugumuzda
    // java default constructor ı siler
    // bu durumda daha once olusturulmus olan objelerde sorun olmaması icin
    // class a parametresiz bir constructor eklememiz faydalı olur.


    public String toString() {
        return "Araba Ozellikleri" +
                "\nmarka= " + marka +
                "\nmodel= " + model +
                "\nyakit= " + yakit +
                "\nyil=" + yil +
                "\nfiyat=" + fiyat;
    }



    public int maxHiz(String yakit){
        int maxHiz=120;

        if (yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=100;
        }
        return maxHiz;

    }
}
