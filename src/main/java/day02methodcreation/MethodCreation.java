package day02methodcreation;

public class MethodCreation {

    //main method içinde kullanacağımız her şey "static" olmaldır.
    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));
        System.out.println(ucSayiyiCarp(2, 1.5,6));

        System.out.println(example3(2,8,3.2));

        //sout yazıp "Enter"e basınız System.out.println otomatik olarak gelir.
        System.out.println();

        //Ekrana birşey yazdırmak için iki tane kod var.     birincisi; System.out.println,==> Yani satır başı yapar.
        //                                                   diğeri System.out.print()      ==>   Satır başı yapmaz.


    }

    // Example 1: toplama işlemi yapan bir method oluştururuz.
    public static double toplamaYap (double a, double b) {
       return a+b;
    }

    // Example 2; 3 sayyı birbiri ile çarpan bir sayı oluşturun=
    public static double ucSayiyiCarp (double a, double b, double c) {
        return a*b*c;
    }

    //Example 3; Üç sayıdan ilk ikisini toplayıp üncü ile çarpan method oluşturup, sonucu ekrana yazdırınız.
    public static double example3 (double a, double b, double c) {
        return ((a+b)*c);
    }


}
