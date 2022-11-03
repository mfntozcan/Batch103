package day08stringmanipulations;

public class StringManupulations02 {

    public static void main(String[] args) {

        //Example 1; Bir String deki space haric kac tane charecter kullanildigini gosteren kodu yaziniz.
        //              "Ali okula gitti." ==>14

        /*String str = "Ali okula gitti.";
        // replace() metoduspesifik bir karekteri veya karekterleri degistirmek icin kullaniriz.
        //

        int num = str.replace(" ","").length();
        System.out.println(num);

         */


        /*//Example2; Bir String deku 'a' harflerinin 'A' ya ceviriniz.

        String s = " Ankara'nin tasina gozlerimin yasina bak";

        String yeniS = s.replace("a", "A");
        System.out.println(yeniS);

         */

        /*//Example 3; Bir String deki tum  "kara' kelimelerinin  yerine "*" koyunuz

        // replace() methodunda coklu karekter yerine tekli karekter koyabiliriz.

        String t = " Kara kara dusunme Ankara";

        String yeniT = t.replace("kara", "*");
        System.out.println(yeniT);//ekranda "Kara * dusunme An*" gorunur. Cunku Kara ile bizim verdigimiz eslesmedi.

         */

       /* //Example 4; Bir String deki tum sayilari "*" a ceviriniz.
        //          "AC201017004"==> AC*********

        String stdId = "AC202117004";
        String yeniStdId = stdId.replaceAll("[0-9]", "*");
        System.out.println(yeniStdId);

        */

        /*
        Bir grup data yi ifade eden kodlara 'regex' denir. Regex= Regular Experssions un kisaltmasidir.

        1) tum rakamlari ifade etmek istersek; [0-9]
        2 tum kucuk harfler ;[a-z]
        3 Tum buyuk harfler ; [A-Z]
        4 Tum harfler ; [a-zA-Z]
        5 Sesli harfler ; [aeiouAEIOU]
        6 Space karekteri ; [ ]
        7 Tum rakamlar ve tum harfler ; [0-9a-zA-Z)
        8 Tum noktalama isaretleri ; \\p{Punct}

        1 Rakamlar haric tum karekterler;[^0-9]==> haric demek '^' tir.
        2 Kucuk harfler haric tum karekterler ==> [^a-z]
        3 Buyuk harfler haric tum karekterler ==> [^A-Z]
        4 Tum harfler haric tum karekterler ==> [^a-zA-Z]
        6 Space haric ==> [^ ]
         */

        //Exampe 5; Verilen bir String de String de kullanilan noktalama isareti ve rakamlar ve space karekteri haric
        // tum karekterlerin sayisini bulan kodu yaziniz.

        /*String u = "Ali 13 yasinda, dersem inanma!...";
        int sonuc = u.
                replaceAll("[0-9]]", "").
                replace(" ","").
                replaceAll("\\p{Punct}","").
                length();
        System.out.println(sonuc);

         */

        /*//Example 6; Bir passwordun gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz.
        //      Kural 1) Space haric en az 8 karekter olmali'
        //      Kural 2) En az bir sembol icermeli
        //      Kural 3) En az bir rakam icermeli
        //      Kural 4) En az bir buyuk harf icermeli
        //      Kural 5) En az bir kucuk harf icermeli

        String pwd = "B77c? K!m";

        //      Kural 1) Space haric en az 8 karekter olmali'
       boolean first = pwd.replace(" ","").length()>7;

        //      Kural 2) En az bir sembol icermeli
       boolean second = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;

        //      Kural 3) En az bir rakam icermeli
       boolean third = pwd.replaceAll("[^0-9]", "").length()>0;

        //      Kural 4) En az bir buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;

        //      Kural 5) En az bir kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;

        boolean pwdGecerli = first&&second&&third&&fourth&&fifth;

        if (pwdGecerli){
            System.out.println("Passwordunuz gecerlidir ...");
        }else {
            System.out.println("Passwordunuz gecerli degildir...");
        }

         */

       /* //Example 7; Bir stringde ki noktalama isaretlerinin sayisini gosteren kodu yaziniz,


        String cumle = "Sen yapmazsan, ben ?...";
        int number =  cumle.replaceAll("[^\\p{Punct}]","").length();

        System.out.println(number);

        */

        //Example 8; Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika' yazdirin
        // aksi halde "Normal " yazdirin

        String v = "kAlex";

        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");

        String result = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);
    }
}
