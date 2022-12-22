package ders06_ifElseStatement;

public class C10_ifElseStatement {
    public static void main(String[] args) {

// kullanıcıdan cinsiyetini ve yaşını alın kadın 60 yaş üstü, erkek 65 yaşüstü emekli olabilir
// değilse kac yılı kalmış yazdırın
// .

        char cınsıyet='k';
        int yas=60;

if (cınsıyet=='E'&&yas>=65){
    System.out.println("emekli olabilirsin");
} else if (cınsıyet=='E'&&yas<65 && yas>15) {
    System.out.println("emekli olmak için daha "+(65-yas)+" yıl çalışmalısın");
} else if (cınsıyet=='K'&&yas>=60 && yas>15) {
    System.out.println("emekli olabilirsin");
} else if (cınsıyet=='K'&&yas<60) {
    System.out.println("emekli olmak için daha "+(60-yas)+" yıl çalışmalısın");
}else {
    System.out.println("geçersiz giriş");
}

    }
}
