package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 01: Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz.


        //1.Way: if-else

        int a = 0;

        if (a > 0) {
            System.out.println("Pozitif");
        } else {
            System.out.println("Pozitif degil");
        }

        //2.Way: ternary
        //Condition   ?      Condition dogru ise uygulanacak kod    :   Condition yanlis ise uygulanacak kod
        String sonuc = a > 0 ? "Pozitif" : "Pozitif Degil";  // a>0?Bunun anlami a sifirdan buyuk mudur.
        System.out.println(sonuc);


        //Example 02: Iki sayidan kucuk olani secen kodu ekrana yazdiran kodu yaziniz.

        int b = 23;
        int c = 23;

        int min = b < c ? b : c;
        System.out.println(min);


        //Example 3: Verinlen bir sayinin mutlak degerini yazan kodu yaziniz

        // Pozitif sayilarin ve sifinin mutlak degeri kendirleridir.
        // Negatif sayilarin mutlak degeri eksi 1 (-1) ile carpilmis halleridir.

        int d = -45;

        int abs = d < 0 ? -1 * d : d;
        System.out.println(abs);

        //Example 4; Iki tane sayi ayni isaretliyse bu sayilari carpiniz. Farkli isaretli ise "Islem yapamam" mesaji veriniz.

        int e = -12;
        int f = 10;


        //Ternary farkli data tiplerinde sonuc return ederse; sonucun data tipini 'Object' yapiniz.
        // Ornegin burada e*f integer, islem yapamam kismi ise String olmali. Ikisini ayni yerde bulusturabilmemiz icin Object kullaniriz.


        Object islem = (e > 0 && f > 0) || (e < 0 && f < 0) ? e * f : "Islem Yapamam";
        System.out.println(islem);

        //note: Java da her class in en az bir tane "parent" class i vardir.
        //      SAdece object class in "paretn" class i yoktur.
        //      Butun class lar non promitive dir.


    }
}
