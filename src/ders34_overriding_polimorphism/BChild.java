package ders34_overriding_polimorphism;

public class BChild extends AParent{
    public void method1(){
        System.out.println("Child class method1");
    }
    public void method2(int a){
        //Overriding olabilmesi icin
        // method ismi ve method signature ayni olmalidir
        System.out.println("Child class method2");
    }
    public void method2(String isim){
        System.out.println("child class String parametreli method2");
    }

    @Override
    public void method3() {
        // super.method3();
        //overriding varsa parent ve child class'daki
        // overriden ve overriding methodlardan sadece biri calisir
        // eger ikisini birden calistirmak istersek super.overridenMethod ismi yazilir.
   /*
   overriding method @Override notasyonu ile isaretlenebilir.
   @override kullanilmayan overriding isleminde
   parent class'taki overridden method silinirse
   hicbir sorun olmaz

   Ancak kullanilan overriding isleminde
   parent class'taki overridden method silinirse veya signature'i degistirilirse
   java CTE verir. Boylece overridden method'un silinmesi engellenir.
    */



    }
}
