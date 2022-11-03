package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    /*
    note: char variable'leri matematiksel işlemlerde kullanırsanız, Java onların ASCII değerlerini kullanır.
    Örneğin: Sstem.out.println('A' + 'C'); ekrana AC yerine 132 yazdırır.

    Note: Java da "+" sembolünün iki anlamı vardır. Birincisi toplama işlemei ikinciside birleştirme işlemidir.(Concatenation=toplama işlemi)
        Java "+" sembolü görünce önce toplama yapmaya çalışır, yapamazsa birleştirme işlemi yapmaya çalışır. O da olmazsa hata verir.
     */

    public static void main(String[] args) {

        //Example 1: Kullanicidan ilk ve soy ismini aliniz, ilk ve soy isminin ilk harflerini ekrana yazdiriniz
        //           Ali Can ==> AC

        Scanner input = new Scanner(System.in);

        //1.Yol:
        //  System.out.println("Ilk isminizi giriniz...");
        //char ilk = input.next().charAt(0);//A

        //  System.out.println("Soy isminizi giriniz...");
        // char son = input.next().charAt(0);//C

        // System.out.println("" + ilk + son);

        //2.Yol:

        System.out.println("Tam isminizi giriniz...");
        String tamIsim = input.nextLine();// Ali Can

        char ilkHarf = tamIsim.charAt(0);

        System.out.print(ilkHarf);

        // split ingilizcede parcalamak anlamina gelir.
        //  split() methodu ikiye bolmeye yarar. Asagidaki soruda tam ismimiz "Ali Can"dir.
        //  Biz yazdigimiz kodda split methodunun icerisene bir adet space karekleri koyduk.
        // Yani tam ismi (Ali Can) bosluktan ikiye bolmesini istedik. Sonrasindaki [1] ise ikiye boldugumuz ismin birinci indexini almammiz icin.
        //Yani sifirinci index Ali, 1nci index Can oldu. sonrada charAt(0) ile Can'in sifirinci indexinden C harfini bulduk.

        char soyIsmınIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsmınIlkHarfi);

    }

}