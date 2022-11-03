package day12loops;

import java.util.Scanner;

public class WhiteLoops01 {

    public static void main(String[] args) {

        //Example 1; 3 den 10 kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz.

        //1nci yol;

        for (int i = 3; i < 11; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();


        // 2nci yol;

        int i = 3;

        while (i < 11) {

            System.out.print(i + " ");

            i++;

        }
        System.out.println();
        //Example 2; 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiaran kodu yaziniz.

        int k = 17;

        while (k > 3) {

            if (k % 2 == 0) {
                System.out.print(k + " ");
            }

            k--;
        }
        System.out.println();
        System.out.println();

        //Example 3 ; 12 den 67 ye kadar sayilarin toplamini veren kodu yaziniz.

        int sum = 0;
        int m = 12;

        while (m < 68) {

            sum = sum + m;

            m++;

        }
        System.out.println(sum);

        //Example 4; size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz.

        int sonuc = 0;

        int sayi = 555;

        while (sayi>0){

            sonuc = sonuc + sayi%10;

            sayi = sayi/10;

        }
        System.out.println(sonuc);



        // Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz.
        //          3==>3*1=3, 3*2=6....3*10=30

        Scanner input = new Scanner(System.in);
        System.out.println("carpim tablosunu gormek icin bir sayi giriniz");

        int s =input.nextInt();

        int n=1;
        while (n<11){
            System.out.println(s + "x" + n + "=" + s*n);

            n++;
        }
    }
}
