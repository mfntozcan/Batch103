package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //Example 1; Kullanicidan bir sayi aliniz. Sayi 100 den kucuk ise ekrana "Kazandin" yazdiriniz.
        //          Aksi halde ekrana "Kaybettin" yazdiriniz.
        //          Kullanici kazandikca oyun devam etmeli.

        Scanner input= new Scanner(System.in);
//      int sayi= 0 ;
//
//        do {
//            System.out.println("Bir sayi giriniz..");
//            sayi = input.nextInt();
//
//            if (sayi<100){
//                System.out.println("Kazandiniz!");
//            }
//        }while (sayi<100);
//
//        System.out.println("Kaybettiniz!!!");



        //Example 2; Kullanicidan isimler aliniz ilk harfinin buyuk harf oluop olmadigini kotrol ediniz.


//        do {
//            System.out.println("Lutfen bir isimi giriniz...");
//            char ilkHarf=input.next().charAt(0);
//
//            if (ilkHarf>='A' && ilkHarf<='Z'){
//                System.out.println("Ismi basariyla girdiniz.");
//            }else {
//                System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal edilmisir...");
//                break;
//            }
//        }while (true);


        // Infinite Loop(Sonsuz Dongu);

        //Arttirma ve azaltma kisminda hata yaparsaniz "Infinite loop sorunsal"i olusur.

//       for (int i=1; i<4; i++){
//            System.out.println("Hi");
//        }
//
//       //Arttirma azaltma ksimini yazmazsaniz "Infinite loop sorunsal"i olusur.
//
//        for (int i=1; i<4; ){
//            System.out.println("Hi");
//        }
        //Arttirma azaltma ksimini yazmazsaniz "Infinite loop sorunsal"i olusur.
        int i=12;
        while (i<15){
            System.out.println("Hi");
        }
    }
}
