package day07ternarystringmanipulation;

public class StringManipulation01 {

    public static void main(String[] args) {

        /*
        ==========================String Class methodlari==================

        Bir methodu ogrenirken iki ayri seyi anlamaliyiz. 1) ne zaman kullanmaliyiz 2) bize ne verir.

        1) equals();
               i) iki tane String in ayni olup olmadigini anlamamiza yarar.
               ii) Bu method "boolean" return eder.

         2) equalsIgnoreCase();
                i) Iki tane String in ayni olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlamamiza yarar
                ii) Bu method bize 'boolean' return eder.

         3) toLowerCase ()'
                i) bir String deki tum harfleri kucuk harfe cevirmek icin kullanilir.
                ii) bu method bize "String" return eder.

         4) toUpperCase ()'
                i) bir String deki tum harfleri buyuk harfe cevirmek icin kullanilir.
                ii) bu method bize "String" return eder.

          5) charAt();
                i) Bir String teki belli bri index deki karekteri almak icin kullanilir.
                ii) Bu method bize char return eder.

           6) Length();
                i) Bir String teki kac tane karekter kullanildigini ogrenmek icin kullanilir.
                ii) Bu method bize integer return eder.

           7) conteins();
                i) Bir String de belli bir karekterin veya kareketerlerin  var olup olmadigini anlamak  icin kullanilir.
                ii) Bu method bize boolean return eder.

           8) split();
                i) Bir String i istedigimiz karekterden  parcalamaya yarar.
                ii) Bu method bize 'Array' return eder.
         */

        /*
        Bir passwordun gecerli olup olmadigini asagidaki kurallara gore kotnrolk eden kodu yaziniz.
        i) En az 8 karekter icermeli
        ii) space karekteri icermemeli
        iii) Ilk harfi "M" veya "m"  olmali
        iv) son charecteri "?" isareti olmali
         */

        String pwd = "Manisa12?";

        //i) En az 8 karekter icermeli
        boolean first = pwd.length()>7;

        //ii) space karekteri icermemeli
        boolean second = !pwd.contains(" ");

        //iii) Ilk harfi "M" veya "m"  olmali
       boolean third = pwd.charAt(0)=='M'|| pwd.charAt(0)=='m';

        //iv) son charecteri "?" isareti olmali
        boolean fourth = pwd.charAt(pwd.length()-1)=='?';


        System.out.println(first && second && third && fourth);//Bunun anlami tum onerilerin dogru olmasini istemektedir

    }
}
