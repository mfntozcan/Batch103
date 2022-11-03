package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {


    public static void main(String[] args) {


        //Example 01; Kullanıcıdan alınna sayının tek mi çift mi olduğunu ekranan yazan kodu yazınız? Sayı tek ise TEK çift ise ÇİFT yazacak.

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz...");
        int s=input.nextInt();

        //1nci Yol:
        if (s%2==0){
            System.out.println("Çift sayı...");
        }
       if (s%2!=0){//"!=" demek "eşit değil" demektir.
            System.out.println("Tek sayı...");
        }

       //2nci yol: bu yolda java tek işlem yaptığı için bu kodu kullanmak daha mantıklıdır. Çünkü java tek işlem yapar. Dolayısıyla uygalamız daha hızlı olur.
        if (s%2==0){
            System.out.println("Çift sayı...");
        }else {// "else" diğer bütün durumlar anlamındadır.
            System.out.println("Tek Sayı...");
        }

        //Example 2: Bir sayının negatif pozitif veya nötr olduğunu söyleyen kodu yazınız?

        System.out.println("Bir sayı giriniz..");
        double d= input.nextDouble();

        if (d>0){
            System.out.println("Pozitif");
        }else if (d==0){
            System.out.println("Notr");
        }else {
            System.out.println("Negatif");
        }

    }
}
