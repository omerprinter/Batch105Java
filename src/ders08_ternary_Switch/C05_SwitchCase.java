package ders08_ternary_Switch;

public class C05_SwitchCase {
    public static void main(String[] args) {
        // kullanıcının girdiği gün numarasının
        // ismini yazdırın.

        int gunNo=7;

     // if (gunNo==1){
     //     System.out.println("Pazartesi");
     // } else if (gunNo==2) {
     //     System.out.println("Salı");
     // }else if (gunNo==3) {
     //     System.out.println("Çarşamba");
     // }else if (gunNo==4) {
     //     System.out.println("Perşembe");
     // }else if (gunNo==5) {
     //     System.out.println("Cuma");
     // }else if (gunNo==6) {
     //     System.out.println("Cumartesi");
     // }else if (gunNo==7) {
     //     System.out.println("Pazar");
     // }else {
     //     System.out.println("Geçersiz numara");
     // }

        switch (gunNo) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("geçersiz gün no");
        }
        }


}
