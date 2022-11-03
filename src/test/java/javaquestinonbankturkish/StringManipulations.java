package javaquestinonbankturkish;


import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {

        //1) Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        //ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        //yazdırınız.

        /*Scanner sehirIsmi=new Scanner(System.in);
        System.out.println("Lutfen bir sehir ismi giriniz...");

       // String sehirIsmi="mIAMIiami";
        String konsolSehirIsmi=sehirIsmi.next().toLowerCase();
        konsolSehirIsmi=konsolSehirIsmi.substring(0,1).toUpperCase()+ konsolSehirIsmi.substring(1);
        System.out.println(konsolSehirIsmi);

         */


        //2) Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        //karakter sayısının toplamını yazdırınız.
        //Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz

        /*String isim1="Mahmut Ozcan";
        String isim2="Turkan Ozcan";
        String isim3="Umut Furkan";

        Integer c1=isim1.replaceAll("\\s","").length(); //replacaAll() methodunun icerisinde bulunan \\s bosluk karekterini almamizi saglar.
        Integer c2=isim2.replaceAll("\\s","").length();
        Integer c3=isim3.replaceAll("\\s","").length();
        System.out.println("Bosluk karekteri olmadan uc ismin karekter sayisi;  "+ (c1+c2+c3));

         */

        /*
        3. Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        konsolda yazdırınız.
        Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir."

         */

        /*String s="Miami 33018!!! ";
        Integer karekterSayisi=s.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
        System.out.println("Toplam alfabetik ve sayisal karekter sayisi; "+karekterSayisi);

         */
        
        /*//4) Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
        //konsolda yazdırınız.
        //Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir

      String s="1a3Bcf4!...";
      int rkmOlmynKrkToplmi= s.replaceAll("[0-9]","").length();
        System.out.println("rakamsiz karekterler toplami; ("+  rkmOlmynKrkToplmi +  ")'dir.");

         */

       /* Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
        Örnek:                  'Ali Can' için n yazdırmalısınız.
                                ‘Miami’ için i yazdırmalısınız.

        */

        /*String s1="Mahmut Ozcan";
        int boslukOlmayansonkarekterIndex= s1.trim().length()-1;
        String boslukOlmayanSonKrkter= s1.substring(boslukOlmayansonkarekterIndex, boslukOlmayansonkarekterIndex+1);
        System.out.println(boslukOlmayanSonKrkter);

         */

        //6) Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
       //toplamını bulunuz.

       /*String s3="Miami";
       int sonKarkter=s3.length()-1;
       char sonKrktAscii= s3.charAt(sonKarkter);
       char ilkKrkAscii=s3.charAt(0);
        System.out.println("Ilk ve son karekterlerin ASCII degelerleri toplami; " + (sonKrktAscii+ilkKrkAscii));

        */

        //7) Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
        //yazdırınız.
        //Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.

      /* String s4= "mahmut ozcan";
       String newS4=s4.substring(1);
        System.out.println(newS4);

       */

        //8) Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
        //büyük harfle yazdırınız.
        //Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.

       /* String s5="Mahmut Ozcan";
        int sonKrkIndex= s5.length()-1;
        String sonKrkDisindakiler=s5.substring(0,sonKrkIndex ).toUpperCase();

        System.out.println(sonKrkDisindakiler);

        */

        //9) Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
        //karakterleri büyük harflerle yazdırınız.
        //Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.

      /*  String s6="Mahmut Ozcan";
        Integer sonKrk=s6.length()-1;
        String ilkVeSonKarkDisindakiler= s6.substring(1, sonKrk).toUpperCase();
        System.out.println("Ilk ve son karekter haricindeki tum harfler buyuk olarak yazilsin; " + ilkVeSonKarkDisindakiler);

       */


        //10) Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
        //olmadığını kontrol etmek için kod yazınız.
        //Örnek:    ‘Ali  Can’ için konsolda false yazmalıdır.
        //          ‘ AliCan ’ için konsolda false yazmalıdır.
        //          ‘ Ali   Can ’ için konsolda false yazmalıdır.
        //          ‘Ali Can’ için konsolda true yazmalıdır.

        /*
        String s7= "Mahmut Ozcan";
        String trimlenmis=s7.trim();
        String hicBoslukYok=trimlenmis.replaceAll("\\s", "");
        boolean ortadaTekBoslukVarMi=trimlenmis.length()-hicBoslukYok.length()==1;
        System.out.println(ortadaTekBoslukVarMi);

         */

       // 11) Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod yaziniz
        //          .Örnek:‘ Ali ’ için kodunuz konsolda false yazmalıdır
        //          ‘Ali’ için kodunuz konsolda true yazmalıdır.

        /*
        String s8= "Mahmut OZCAN";
        String trimlenmis=s8.trim();
        boolean sonuc=s8.equals(trimlenmis);
        System.out.println(sonuc);
         */

        //12) Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod yaziniz.
         //Örnek:‘Ali’ için kodunuz konsolda false yazdırmalıdır
        // ‘ali.’ için kodunuz konsolda false yazdırmalıdır
        // ‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
        // ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
        // ‘ALI.’ için kodunuz konsolda true yazdırmalıdır

        /*

        String s9="Mahmut Ozcan.";

        char ilkKrk=s9.charAt(0);
        char sonkrk=s9.charAt(s9.length()-1);
         boolean ilkkrkBuyukMu= ilkKrk>='A' && sonkrk<='Z';
         boolean sonKrkNoktaMi= sonkrk=='.';
         boolean ilkkrkBuyukSonkrkNoktaMi= ilkkrkBuyukMu && sonKrkNoktaMi;
        System.out.println(ilkkrkBuyukSonkrkNoktaMi);

         */

        //13) Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        //Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir.
        // Şifrede en az 1 sembol olmalıdır.

        //Örnek:'A2b!' için kodunuz konsolda false yazdırmalıdır.
        // 'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
        // '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
        // '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
        // '! a b 3 k' kodunuz konsolda false yazdırmalıdır.


        /*
        String sifre="aa@345678";
        boolean enAz8KrkMi= sifre.replaceAll("\\s","").length()>=8;
       boolean enAz1SmbVarMi=sifre.replaceAll("\\s","").replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println("Sifre Gecerli mi?;"+(enAz8KrkMi&&enAz1SmbVarMi));

         */

        //14) Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek için kod yazınız.

        /*
        //1nci yol

        String s="Java";
        boolean sonuc=s.contains("a");
        System.out.println("Karekter var mi? "+sonuc);
                 */

        //2nci yol;

       /* String s ="Java";

        boolean sonuc=s.replaceAll("[^v]","").length()>0;
        System.out.println(sonuc);

        */

        //3.yol.
        /*
        String s="Java";
         boolean sonuc=s.indexOf("v")!=-1;
        System.out.println(sonuc);

         */

        //15) String gomlekFiyat = ‘$12.99’;
        // String kitapFiyat = ‘$35.99’;
        //Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.

        /*
        String gomlekFiyati="$12.99";
        String kitapFiyati="$35.99";

        String newGomlekfiyati= gomlekFiyati.replaceAll("[$]","");
        String newKitapFiyati= kitapFiyati.replaceAll("[$]", "");
        double a=Double.valueOf(newGomlekfiyati);
        double b=Double.valueOf(newKitapFiyati);

        System.out.println((a+b)/100);

         */



        //16) Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
        //Not: İkinci isim kapsam dışındadır.
        //Örnek: Tom Hanks ==> TH, Mary Star ==> MS

/*
        String isimSoyisim= "Furkan Ozcan";

        String isimIlkharf=isimSoyisim.substring(0,1);
        String soyIsimIlkHarf=isimSoyisim.split(" ")[1].substring(0,1);
        System.out.println(isimIlkharf+soyIsimIlkHarf);

 */
        //17) Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.

        /*

        String s = "Vay be! Ali '13 yaşında, ama üniversite öğrencisi.";
        int toplamKrkSayisi = s.length();
        int noktalamaIsaretleriDisindakilerinSayisi = s.replaceAll("\\p{Punct}", "").length();
        int noktalamaIsaretlerininSayisi= toplamKrkSayisi - noktalamaIsaretleriDisindakilerinSayisi;
        System.out.println(noktalamaIsaretlerininSayisi);

         */






































    }
}
