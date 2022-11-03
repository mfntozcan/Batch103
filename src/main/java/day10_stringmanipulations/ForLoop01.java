package day10_stringmanipulations;

public class ForLoop01 {

    //loop; dongu demektir. Bir seyi tekrar tekrar yapmak demektir.
    //Java da tekrarli isler icin "loop" kullanilir.

    // Dort cesit "loop" vardir.
    // i) for-loop
    // ii) while-loop
    // iii)do-while-loop
    // iv) for-each -loop


    public static void main(String[] args) {

        //Example 1; Ekrana 5 kere "Hi" yazdiriniz.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //for-loop
        //Example 2: ekrana 5 kere "Hi" yazdiriniz.

        //    Baslangic bolumu  Loop hangi sart altinda calisacak   Increment(artirma) veya Decrement(Azaltma)
        for (int i = 1; i < 6; i = i + 1) {
            System.out.println("Hi");
        }
        //Example 3; 4 den 7 ye kadar tum tamsayilari ekrana yazdiran kodu yaziniz.

        for (int i = 4; i < 8; i = i + 1) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Example 4;  14 den 5 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 14; i > 4; i--) {
            System.out.print(i + ", ");
        }


        System.out.println();

        //Example 5; 14 ten 5 e kadar tum cift sayilari yazdiriniz.

        //1.Yol;

        for (int i = 14; i > 4; i -= 2) {
            System.out.print(i + ", ");
        }

        System.out.println();
        //2.yol;
        for (int i = 14; i > 4; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //Example 6; 28 den 157 ye kadar tum tek tamsayilarai ekrana yazdirin.

        for (int i = 28; i < 158; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


        //Example 7 ; "Java" Stringini "J*a*v*a*" Stringine ceviren kodu yazziniz.

        String str = "Java";

        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + "*");

        }
        System.out.println();
        System.out.println("Alt satira bakiniz.");

        //Example 8: Size verilen String'de tekrarsiz karakterleri ekrana yazdiriniz
        //           "Hellooo Ali" ==> He Ai
        String s = "Hellooo Ali";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.print(c);//He Ai
            }
        }

    }
}
