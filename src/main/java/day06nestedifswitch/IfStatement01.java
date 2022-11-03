package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Kullanicidan yas degeri olan kodu aliniz ve yasin evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz.
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //tanimlanmamis Evre.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Yasinizi Giriniz....");
        int yas = input.nextInt();

        if (yas < 0) {
            System.out.println("Gecerli yas giriniz");
        } else if (yas < 5) {
            System.out.println("Bebek");
        } else if (yas < 13) {
            System.out.println("Cocuk");
        } else if (yas < 21) {
            System.out.println("Genc");
        } else if (yas < 31) {
            System.out.println("Yetiskin");
        } else {
            System.out.println("Tanimlanmamis Yas Grubu....");
        }

        // Boundary Valve Analyze Test (BVA): Sınır değeri analiz testidir.
        // Kritik değerleri,öncesini ve sonrasını test etme yönteminin ismidir


        // Test yaparken kritik degerlerin altinda ve ustunde kalan tum degerlerle test yapmaya "Boundry Valve Analyze Test" (BVA) denir.
        //turkcesi: Sinir degerlerini analiz ederek test etmedir.
        //test kod yazmak kadar onemlidir.


    }//main method
}//clas
