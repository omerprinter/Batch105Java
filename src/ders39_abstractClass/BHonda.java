package ders39_abstractClass;

public abstract class BHonda extends Araba{
    // Abstract bir class'i parent edindigimizde 2 altrnatifimiz olur
    // 1- Parent'imiz olan abst. calss'daki methodlari override etmek
    // 2- Proje yapimiz gerektiriyorsa bu class'i da abst.  yapmak.

    public void marka(){
        System.out.println("marka : Honda");
}

       public abstract void yakit();

        public abstract void guvenlik();

        public void ozelTeknoloji(){
            System.out.println("Tum Honda arabalar Vtec teknolojisi kullanir");
        }
}
