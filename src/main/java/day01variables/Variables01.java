package day01variables;

public class Variables01 {

    //Variable nasil olurşturulur?

    //1) Acces Modifier   2 DAta Type     3)Variable ismi 4)=     5)Deger   6);

    // Java'da ";" İngilizde'deki "." gibidir.
    // İngilizcede cümle deriz. Java da "statement" deriz.

    // "=" sembolü "Assignment (atama) operator olarak adlandırılır.
    // Assignment operator sağdaki değeri alır soldaki variable'nin içerisine koyar.

    public int age = 13;
    public int height = 183;

    //Java'da Data Type!leri
        /*
                         Primitive Data Types
        1) int: İntegar(tam sayı)'ın kısaltılmasıdır.           32 bit kullanır.
                Matematikte tam sayıların başı ve sonu yoktur fakat Java'da tam sayıların başı ve sonu vardır.
                En küçük int = -2,147,483,648
                En büyük int =  2,147,483,647

         2) byte: Tamsayılar için kullanılır.                   8 bit kullanır.
                En küçük byte:-128
                En büyük byte: 127              aralık küçük olduğu için memory daha az kullanılır.

         3)short: Tam sayılar için                               16 bit kullanır.
                En küçük short= -32768
                En büyük short=  32767             İnt ve byt arasında bir değere ihtiyacımız olursa short kullanırız.

         4)Long: Tam sayılar içindir.       İnteger'in yetmediği yerler içindir.    64 bit kullanır.
                En küçük long= -9,223,372,036,854,755,808
                En büyük long= -9,223,372,036,854,755,807

          5)float: ondalıklı sayılar içindir. fiyatlar için kullanmak tavsiye edilir. Memory de 32 bit yer kaplar
                    "float" virgülde sonra 7 basamak .
                    "float" değerlerinde sona "f" veya "F" koymamız gerekir.

          6) double: ondalıklı sayılar içindir.   Hassas ölçümler için kullanılır.  Memory de 64 bit yer kullanır.
                    virgülden sonra 16 basamak içeririr.

          7)boolean: "true" veya "false" değerleri için  kullanılır. 1 bit kullanır.

          8) char: Tek karekterler için kullanılır. 16 bit kullanır.
                    A, c, 2, ?, _ (anderscore), =
                    Char'lara değer verirken; değeri tek tırnak (') arasına koyun. Yoksa hata verir.

                    Note:   Java büuyük ve küçük harflere duyarlıdır.
                            Yani Java için TRUE ile true tamamen farklıdır.

       Note: Data tipleri adımız gibi bilmeliyiz. Neyi bileceğiz: Numeric Data Types: byte<short<int<long<float<double
                                                                  Numeric Olmayan Data Types: boolean - char

                                    Non-Primitive Data Types
           String: İsim, adres, kimlik numarası gibi bir veya birden fazla karekter içeren deperlerde kullanılır.
                    String deperleri mutlaka çift tırnak arasına konulmaldık. aksi halde hata alınır.
                    String non-primitive Data Types'dır. Yani bir String oluşturduğumuzda Java size bir sürü method verir.

                    Primitive ile Non-Primitive arasındaki farklar?
         1) Non-primitive Data type'lerinde değerin yanında method'lar vardır.
            Primitive data type'larında ise sadece değer vardır, method yoktur.
         2) Primitive data type'ları Java tarafından oluşturulmuştur, toplam 8 tanedir. Biz Primitive data oluşturamayız.
            Non-primitive data type'leri Java tarafından da oluşturulmuştur, biz de oluşturabiliriz.
            Non-Primitive'ler sayılamayacak kadar çoktur. Çünkü her developer Non-Primitive data type oluşturablir.
         3) Primitive data type'leri isimlendirilirken küçük harflerle başlar,
            Non-primitive data type isimleri büyük harfle başlar.
         4) Primitive data type'ler memory'de farklı büyüklükte yerler kullanırlar.
            Non-Primitive'lerin hepsi memory'de aynı büyüklükte yer kullanırlar.



     */
    public byte price = 12;
    public short populationOfVillage = 23000;

    public float priceOfShirt = 13.99F;
    public double weightOfCell = 0.0000012045;

    // Siz "long" demenize rağmen java verilen sayıyı "int" kabul eder.
    //bu yüzden long bir veriables'e int aralığının dışında bir sayı verirseniz mutlaka sonuna "l" veya "L" koyunuz.
    public long populationOfWorld = 7000000000L;

    //Burada sonuna L koymadığımız halde problem yok. Çünkü 1234 sayısı İnt aralığına uyar.
    public long x = 1234;

    public boolean isold = true;
    public boolean isrich = false;

    public char initial = 'S';

    public String name = "Tom Hanks";

    //Note: "main method" arabanın motoru gibidir.
    //      "main method" çalışmadan hiçbir şey çalışmaz.

    public static void main(String[] args) {

    }


}
