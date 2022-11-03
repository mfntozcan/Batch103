package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Kara kara dusunme ankara";

        // indexOf () mehtodu verilen character veya character lerin ilk gorunumun indexi verir.
        int idxA = str.indexOf("kara");
        System.out.println(idxA);

        //lastIndexOf() methodu character veya character lerin son  gorunumun indexi verir
        int idxA2 = str.lastIndexOf("kara");
        System.out.println(idxA2);

        String s = "Mississippi";

        int idxI = s.indexOf('i');// indexOf () hem String hemde char ile kullanilabilir.
        System.out.println(idxI);


        int idxIss1 = s.indexOf("iss");// ilk gorunumun ilk karakterinin indexini verir.
        System.out.println(idxIss1);

        int idxIss2 = s.lastIndexOf("iss");// son gorunumun ilk karakterinin indexini verir.
        System.out.println(idxIss2);

        // Example 1 ; Bir String deki bir karekterin tekrarli veya tekrarsiz olup olmadigini g,steren kodu yaziniz.
        //          "Helloooo"==> H -> tekrarsiz, e-> tekrarsiz, l-> tekrarli. o-> tekrarli

        String t = "Helloooo";

        char c = 'H';

        if (t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsiz");
        }else {
            System.out.println("Tekrarli");
        }

        String u = "Learn Java earn manoy";
        //IndexOf () iki parametre ile kullanirlirsa ikinci parametrede verilen sayi kadar karekteri gectikgten sonra
        // istenen karekterin ilk gorunumun indexini return eder.

        int sonuc = u.indexOf("e", 4); //Java bana a nin ilk karekteri lazim ama 6nci index ten sonrkini istiyroum.
                                                    // (n nin ilk gorunumunu bana ver ama ilk bes karekteri dikkate alma)
                                                    // BAzen String deki bir kareteri gormezden gelmek isteriz. O zaman bunu kullaniriz.
                                                    // indexOf() un dort adet kullanimi vardir,
        System.out.println(sonuc);

        // lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabul edip en bastan
        //bu indexe kadar olan karakterleri bir kutu icine aliriz ve LastIndexOf() method unu sadece bu kutu icindeki String icin kullaniniz.

        String m = "Hello everyone!";
        int e = m.lastIndexOf("e", 10);
        System.out.println(e);






        //isEmpty() methodu bir String in bos olup olmadigini kortol eder.
        //Eger String de hic karekter yoksa isEmty() true return eder. Herhangi bir karekter varsa false return eder.
        // length()==0 demek isEmpty() true verir demektir. Bunlar ayni neden Java bunu olusturdu.
        // Cunku length()==0 da iki is vardir. isEmpty() de tek is yapar. app daha az is yapar.
        //Bir Stringin bos olup olmadigini anlamamiz icin length()==0 kullanmayin. isEmpty() kullanin.

        String v = " ";
       boolean bosMu = v.isEmpty(); // Verilen string in bos karekter olup olmadigini verir. True False olarak verir.
        System.out.println(bosMu);

        // isBlank() hem bos String icin hem de sadece space iceren Stringler icin true return eder.
        //Kullanciya ismini gir komutu verilir. ama kullanici hicbir sey girmiyorsa isBlank() kullanilir.
        String x = " ";

        boolean blankMi = x.isBlank();
        System.out.println(blankMi);


        //Example 2: Kullanicidan alinan isim mutlaka space den farkli ve en az bir karekter icermelidir.


        Scanner input = new Scanner(System.in);
        System.out.println("Ilk Isminizi giriniz...");
        String ilk = input.nextLine();

        if (ilk.isBlank()){
            System.out.println("Sana ismini gir dedim...");
        }else {
            System.out.println(ilk);
        }
    }
}
