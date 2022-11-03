package day11loops;

public class ForLoop01 {

    public static void main(String[] args) {

        // Example 1; 3 ten altiya kadar tam sayinlarin toplamini bulan kodu yaziniz.


        //Note: System.out.println(sum); loop'un disina yazilirsa "sum"in sadece son degerini ekrana yazdirir
        //System.out.println(sum); loop'un icine yazilirsa her bir lopp için "sum"in hangi degerlerini aldigini yazdirir.

        int sum = 0;

        for (int i = 3; i < 7; i++) {

            sum = sum + i;
        }
        System.out.println(sum);


        //Example 2; 6 dan 3 kadar tamsayilarin carpimini bulan kodu yaziniz.

        int multiply = 1;

        for (int i = 6; i > 2; i--) {

            multiply = multiply * i;
        }
        System.out.println("Example 2'nin sonucu;  " + multiply);

        //Example 2; Size verilen  bir tam sayinin rakamlari toplamini bulunuz.

        int num = 385;

        num = Math.abs(num);// eger ki sayi negatif olursa bu islme mutlak degerini alir. Ve sayiyi pozitife cevirir,

        int sonuc = 0;

        for (int i = num; i > 0; i = i / 10) {

            sonuc = sonuc + i % 10;

        }
        System.out.println("Example 3'un sonucu;  " + sonuc);


        //Example 4; size verilen bir Stringi ters ceviren kodu yaziniz.
        // ornek;      "Kaba"==> "abaK" olacak sekilde.

        String str = "Kaba";

        String ters = "";// concatenation yapacaksak "" olarak kullanilir.

        for (int i = str.length() - 1; i > -1; i--) {

            char c = str.charAt(i);

            ters = ters + c;
        }
        System.out.println("Example 4'un cevabi;  " + ters);


    }
}
