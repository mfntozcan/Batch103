package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Example 1Kullanıcıdan bir diktörgenin en ve boyunu alıp alan ve çevresini hesaplayan kodu yazınız.
        Scanner input = new Scanner(System.in);

        System.out.println("Diktörtgenin kısa kenarını giriniz...");
        int en = input.nextInt();


        System.out.println("Diktörtgenin uzun kenarını giriniz...");
        int boy = input.nextInt();

        System.out.println("Alan  " + en*boy);

        System.out.println("Cevre  " + 2*(en+boy));





    }




}
