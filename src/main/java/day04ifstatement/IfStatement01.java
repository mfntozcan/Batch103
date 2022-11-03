package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        //If it rains I wil cancel the picnic.(Eger yagmur yagarsa piknigi iptal edecegim). Yani sart ve sonuc bolumu var.
        //sart gerceklesirse sonuc kismi aktif olacak. Yani yagmur yagarsa; true oldugunda ikinci ksiim calisir

        //If statement belli kodları belli sarlara bağlı olarak çalıştirmaya yarar.

        //Example 1: Sayı pozitif ise ekrana pozitif yazdırın.


        int s = 12;

        if (s > 0) {
            System.out.println("Positive");
        }


        //Example 2: Verilen character büyük harf ise ekrana "Büyük Harf" yazdırın.
        char ch = 'A';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Büyük Harf");
        }

        /*
        && işlemi sadece boolean ile kullanılır. .
                true && true = true
                true && false= false
                false && true = false
                false && false= false
         && işlemi mükemmeliyetçidir. true sonucunu alabilmek için herşey true olmalıdır.
            Bir tane false varsa sonuç false demektir.


         */
//--___________________________________________________________________________________________________________________--//
        //Example 3: Verilen bir sayı uç basamklı ise ekrana "Uç basamklı" yazrırınız.

        int n = -123;

        n = Math.abs(n); //==>Bu kisim "n" sayisinin mutlak degerini alir.
        // Bu tarz islemlerde sayinin (-) ve (+) halinide dusunmek zorundayiz. Yoksa yazdigimiz kodlar tam olarak dogru olmaz.

        if (n > 99 && n < 1000) {// n>=100 && n<=999 veya n>99 && n<1000 bu sekildede yazdirabiliriz.
            // Ancak ilkinde java iki ayri islem yapacak. Bu nedenle biz ikinci kodu tercih etmeliyiz.
            System.out.println("Üç Basamaklı");
        }

//--___________________________________________________________________________________________________________________--//

        //Example 4: Verilen sayı çift sayı ise ekrana çift sayı yazdırın.

        int p = -18;
        p = Math.abs(p);//==>Bu kisim "n" sayisinin mutlak degerini alir.

        // Java da "=" sembolü atama oporatörüdür. Matematikteki eşittir anlamına gelmez.
        // matematiksel eşittir anlamı vermek için "==" yazmamız gerekir.
        // Javada esitligi su sekilde (2+3 == 5) gosteririz.

        if (p % 2 == 0) {
            System.out.println("Çift Sayı");
        }

//--___________________________________________________________________________________________________________________--//


        //Example 5: Verilen bir sayı 300 den küçük veya 1200 den büyük ise ekrana "Harika Sayı" yazdır.

        int r = 250;

        if (r < 300 || r > 1200) {
            System.out.println("Harika Sayı");


        }

    /*
     || (veya ) islemi sadece boolean ile kullanilir.
      true || true = true
      true || false= true
      false || true= true
      false || false= false

    Note: || işleminde false olabilmek için herşeyin false olması gerekir.
          || işleminde sadece bir tane true sonucu true yapmaya yeter.

     */


    }


}
