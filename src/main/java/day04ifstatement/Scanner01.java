package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        /*
          //main method olmadan kodlar çalışmaz.

         */

        Scanner input = new Scanner(System.in);

        //Example 1: Kullanıcıdan ilk ismini orta ismini soy ismini ve kimlik numarasını aliniz ve asagidaki formatta yazdıralım.
        // Ali Mert Can
        //123456789

        //1. Yol:
        System.out.println("Ilk isminizi giriniz...");
        String ilkIsim = input.next();
        // next() methodu kullanicidan String datasi almak icin kullanilir. Ilk ismi almak icin bunu kullandik.

        System.out.println("Orta isminizi giriniz...");
        String ortaIsim = input.next();

        System.out.println("Soy isminizi giriniz...");
        String soyIsim = input.next();

        System.out.println("Kimlik numaranizi giriniz...");
        String kimlikNo = input.next();
        // Eger matematiksel islem yapmayacaksak bir datanin String alinmasi avantajlidir. Cunku icerisinde bir cok method barindirir

        System.out.println(ilkIsim + " " + ortaIsim + " " + soyIsim);
        System.out.println(kimlikNo);

        // 2. Yol:
        System.out.println("Ilk, orta ve soy isminizi giriniz...");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " + orta + " " + soy);
        System.out.println(kimlik);

        /*
        *****        next() ile nextLine() arasındaki fark nedir?           ******

        next() methodu kullanıcıdan gelen String in sadece ilk kelimesini alır.
        * ornegin kullanici ismini ; Ali Can Mert yazsa bu ifade konsolda sadece Ali olarak gozukecek.
        *
        *
        nextLine() methodu kullanıcıdan gelen  String in tamamını alır.
        * Kullanici ismini Ali Mert Can yazsa. Bu ifade konsolda Ali Mert Can olarak cikar.
         */

        //3.Yol:
        System.out.println("Ilk, orta ve soy isminizi giriniz");
        String tamIsim = input.nextLine();
        System.out.println(tamIsim);

        System.out.println("Kimlik numaranızı giriniz");
        String kimlikNumarası = input.next();
        System.out.println(kimlikNumarası);


    }


}
