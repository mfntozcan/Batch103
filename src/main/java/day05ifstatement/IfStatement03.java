package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {


    /*
    Ikı tane String'in biribirine eşit olup olmadını anlamak için "==" değil "equals()" kullanılmalıdır.

    Kod yazarken kodu kisa yazmak onemlidir. Buna atomik de denilebilir.

    İki tane String'in birbirine eşit olup olmadığını kontrol etmek için iki tane method kullanılabilir.
        Bu methodlardan birincisi   ==>equals() ==> büyük harf ve küçük harfi önemser.  Mesela "A" ile "a" aynı değildir.
        Bu methodlardan ikincisi    ==>equalsIgnoreCase() ==> büyük harf ve küçük harfi önemsemez. Mesela "A" ile "a" aynıdır..
        Ingilizcede ignore umursamamak anlamindadir.
        Case de durum demektir.

     */
    public static void main(String[] args) {

        //Example 1: Kullanıcıdan gün isimlerini alınız, o günün hafta sonu mu hafta içi mi olduğunu kullanıcıya söyleyiniz.
        //           Pazartesi==>Hafta içi           Pazar==>Hafta Sonu
        Scanner input = new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz...");
        String gun = input.next();

        //equals() methodu esittir anlamindadir.

        if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Hafta Sonu");
        } else if (gun.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Salı")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Çarşamba")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Perşembe")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta Sonu");
        } else {
            System.out.println("Geçerli bir gün ismi giriniz.");
        }

        //2.Yol:
        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        } else if (gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz...");
        }

        //3.Yol\

        boolean haftaSonu = gun.equalsIgnoreCase("Pazar") ||
                gun.equalsIgnoreCase("Cumartesi");

        boolean haftaIci = gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma");

        if (haftaSonu) {
            System.out.println("Hafta sonu...");

        } else if (haftaIci) {
            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz...");
        }
    }
}

