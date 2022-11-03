package javaquestinonbankturkish;

import java.util.Scanner;

public class IfStatatement {

    public static void main(String[] args) {

        /*//1) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        //a) Aralık, Ocak, Şubat için "Kış"
        //b) Mart, Nisan, Mayıs için "İlkbahar"
        //c) Haziran, Temmuz, Ağustos için "Yaz"
        //d) Eylül, Ekim, Kasım için "Sonbahar"
        //e) Diğerleri için "Geçersiz ay adı"


        String ayAdi = "mayis";

        ayAdi = ayAdi.toLowerCase();

        if (ayAdi.equals("aralik") || ayAdi.equals("ocak") || ayAdi.equals("subat")) {
            System.out.println(ayAdi + " ayi Kis mevsimindedir.");
        } else if (ayAdi.equals("mart") || ayAdi.equals("nisan") || ayAdi.equals("mayis")) {
            System.out.println(ayAdi + " ayi Ilkbahar mevsimindedir.");
        } else if (ayAdi.equals("haziran") || ayAdi.equals("temmuz") || ayAdi.equals("agustos")) {
            System.out.println(ayAdi + " ayi Yaz mevsimindedir.");
        } else if (ayAdi.equals("eylul") || ayAdi.equals("ekim") || ayAdi.equals("kasim")) {
            System.out.println(ayAdi + " ayi Sonbahar mevsimindedir.");
        } else {
            System.out.println("Lutfen gecerli bir ay ismi giriniz...");
        }

         */

        /*//2) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        //a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
        //b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
        //c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
        //Not: Çözümdeki koşulların sıralarına dikkat ediniz

        String sifre="!abcjh34";

        if (sifre.replaceAll("\\S", "").length()>0){
            System.out.println("Sifrede Bosluk karekteri kullanmayiniz...");
        } else if (sifre.replaceAll("\\s","").length()>7) {
            System.out.println("Gecerli Sifre");
        }else {
            System.out.println("Gecersiz Sifre");
        }

         */

        /*//3) Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
        //Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb.

        byte ayNo=11;

        if (ayNo==1){
            System.out.println("Ocak");
        } else if (ayNo==2) {
            System.out.println("Subat");
        } else if (ayNo==3) {
            System.out.println("Mart");
        } else if (ayNo==4) {
            System.out.println("Nisan");
        } else if (ayNo==5) {
            System.out.println("Mayis");
        } else if (ayNo==6) {
            System.out.println("Haziran");
        } else if (ayNo==7) {
            System.out.println("Temmuz");
        } else if (ayNo==8) {
            System.out.println("Agustos");
        } else if (ayNo==9) {
            System.out.println("Eylul");
        } else if (ayNo==10) {
            System.out.println("Ekim");
        } else if (ayNo==11) {
            System.out.println("Kasim");
        } else if (ayNo==12) {
            System.out.println("Aralik");
        }else {
            System.out.println("Gecerli bir sayi giriniz.");
        }

         */

       /* //4) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        //a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
        //b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”

        int i=13;

        if (i%10>=5){
            System.out.println("Son basamagi bir ust ondaliga yuvarla"+" "+ (i/10+1)*10);
        }else{
            System.out.println("Son basamagi bir alt ondaliga yuvarla"+ " " +( i/10)*10);
        }

        */

        /*


        /*
        //5) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.


        //a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        //b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
        //c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"

        int a=7;
        int b=7;
        int c=7;

        if (a==b && b==c){
            System.out.println("Bu ucgen esit kenar ucgendir.");
        } else if (a==b && b!=c || a==c && b!=c || b==c && a!=c) {
            System.out.println("Bu ucgen ikiz kenar ucgendir.");
        }else {
            System.out.println("Bu ucgen cesit kenar ucgendir.");
        }














        //7) Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.

        //a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.+++++

        //b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.

        //c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.+++

        //d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
        //yazmalıdır.
        //e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
        //yazmalıdır.
        //Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
        //görünmelidir. Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve
        //"Geçersiz Ad"


        /*String isim="Ali Can";

        String isminIlkHarfi=isim.substring(0,1);//A
        int boslukIndex=isim.trim().indexOf(" ");
        char soyIsimIlkKrk = isim.split(" ")[1].charAt(0);
        boolean isminIlkHarfiBuyukMu= (isminIlkHarfi.charAt(0)>='A' && isminIlkHarfi.charAt(0)<='Z');
        boolean soyIsminIlkHarfiBuyukMu= (soyIsimIlkKrk>='A' && soyIsimIlkKrk<='Z');

        if (!isminIlkHarfiBuyukMu || !soyIsminIlkHarfiBuyukMu){
            System.out.println("Isminizin bas harflerinde hata var.");
        }if (isim.equals(isim.toUpperCase())){
            System.out.println("Isim ve soy isminizde format hatasi var...");
        }if (isim.replaceAll("\\s","  ").length()==0){
            System.out.println("Isim girilmedi");
        }

         */
        /*
        String isim = "Ali Can";
        String adinIlkHarfi = isim.substring(0,1);
        Integer boslukIndex = isim.trim().indexOf(' ');
        String soyadinIlkHarfi = isim.substring(1,2);
        Boolean adinIlkHarfiBuyukMu = (adinIlkHarfi.charAt(0)>='A' && adinIlkHarfi.charAt(0)<='Z');
        Boolean soyadinIlkHarfiBuyukMu = (soyadinIlkHarfi.charAt(0)>='A' && soyadinIlkHarfi.charAt(0)<='Z');

        if(boslukIndex ==-1){
            System.out.println("Ad veya soyadi eksik ");
        }
        if(!adinIlkHarfiBuyukMu || !soyadinIlkHarfiBuyukMu){
            System.out.println("Bas harflerinde hata");
        }
        if(isim.equals(isim.toUpperCase())){
            System.out.println("Format hatasi");
        }
        if(isim.replaceAll("\\s","").length()==0){
            System.out.println("Isim girilmedi ");
        }
        if(isim.replaceAll("\\s","").replaceAll("[A-Za-z]","").length()>0){
            System.out.println("Gecersiz Isim");
        }

         */


       /* //8) ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
        //a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden fazla olamaz" yazmalıdır.
        //b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
        //c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz, "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez" yazmalıdır.

        //Not: Kısaltmada 1'den fazla hata varsa ilgili tüm hata mesajları yazdırılmalıdır.
        //örnek; "fl3" için kodunuz; "Eyalet kısaltmaları 2 karakterden fazla olamaz", "Eyalet kısaltmaları
        //küçük harf içeremez", ve "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez"
        //yazmalıdır

        String eyaletKisaltmasi= "AA";

        if (eyaletKisaltmasi.length()>2){
            System.out.println("Eyalet Kisaltmalari 2 karekterden fazla olamaz");
        }if (eyaletKisaltmasi.replaceAll("[^a-z]","").length()!=0) {
            System.out.println("Eyalet Kisaltmalari kucuk harf iceremez.");
        }if (eyaletKisaltmasi.replaceAll("[a-zA-Z]", "").length()!=0){
            System.out.println("Eyalet isimleri farkli karekter iceremez.");
        }else {
            System.out.println("Eyelat kisaltmasi gecerlidir.");
        }

        */

        //9) Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
        //oluşturmak için kod yazınız.

        //a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
        //b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
        //c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
        //d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.

        /*//1nci yol


        double a=6, b=11;
        String operator="a";

        if (operator.equals("+")){
            System.out.println(a+b);
        }if (operator.equals("-")){
            System.out.println(a-b);
        }if (operator.equals("*")){
            System.out.println(a*b);
        }if (operator.equals("/")){
            System.out.println(a/b);
        }

         */



       /* //2nci yol;

        Scanner input= new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz.");
        double sayi1= input.nextDouble();
        System.out.println("Lutfen ikinci sayiyi giriniz..");
        double sayi2= input.nextDouble();
        System.out.println("Lutfen bir islem giriniz");
        String operator=input.next();

        if (operator.equals("+")){
            System.out.println(sayi1+sayi2);
        }if (operator.equals("-")){
            System.out.println(sayi1-sayi2);
        }if (operator.equals("*")){
            System.out.println(sayi1*sayi2);
        }if (operator.equals("/")) {
            System.out.println(sayi1 / sayi2);
        }

        */

        //10) Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod yazınız.

        //Geçersiz BMI değeri < 0
        //Zayıf = <18.5
        //Normal ağırlık = 18.5–24.9
        //Fazla kilolu = 25–29.9
        //Obezite = 30 veya daha büyük BMI



        //1NCI Yol;
/*
        double bmi=24.9;

        if (bmi<0){
            System.out.println("Gecersiz BMI degeri");
        }if (bmi<18.5){
            System.out.println("Zayif");
        }if (bmi>=18.5 && bmi<25){
            System.out.println("Normal Agirlik");
        }if (bmi>=25 && bmi<30){
            System.out.println("Fazla Kilolu");
        }if (bmi>=30){
            System.out.println("OBOZITE!!!");
        }

 */


/*
        //2.Yol;

        Scanner input = new Scanner(System.in);
        System.out.println("Vucut Kitle Endeksi(bmi) Degerini Giriniz.");
        double bmi = input.nextDouble();

        if (bmi<0){
            System.out.println("Gecersiz bmi degeri");
        }if (bmi<18.5){
            System.out.println("Normal Agirlik");
        }if (bmi>=18.5 && bmi<25){
            System.out.println("Normal Agirlik");
        }if (bmi>=25 && bmi<30){
            System.out.println("Fazla Kilolu");
        }if (bmi>=30){
            System.out.println("Obozite");
        }


 */



       /* //6) Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
            //kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
            //a) Kullanıcı mile değerini 10 ve operatorü milden Kmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
            //b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenS aate olarak girdiğinde, konsolda
            //kodunuz "2" yazmalıdır (sayı dinamik olacak)
            //c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdan Santigarata olarak girdiğinde, konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cevirmek istediginiz degeri giriniz.");
        double deger = input.nextDouble();

        System.out.println("Lutfen yapmak istediginiz islemi giriniz.\n\n"+
                "Mili KM'ye cevirmek icin ekrana 'K' harfi giriniz.\n" +
                "SAniyeyi saate cevirmek icin ekrana 'S' harfi giriniz.\n" +
                "Fahrenhayti Santigrat dereceye cevirmek icin ekrana 'C' harfi giriniz.");
        String  operator=input.next();

        if (operator.equals("K")){
            System.out.println(deger*1.60934);
        }else if (operator.equals("S")){
            System.out.println((deger+ " "+ "saniye "+" "+ ((deger/60)/60)+" "+"saattir."));
        }else if (operator.equals("C")){
            System.out.println((deger-32)*5/9);
        }else {
            System.out.println("Gecersiz bir operator karekteri girdiniz \n Lutfen 'K', 'S', 'C' operatorlerinden birini giriniz. ");
        }

        */

/*
        String isim = "Mahmut Ozcan";
        String adinIlkHarfi = isim.substring(0,1);


        Integer boslukIndex = isim.trim().indexOf(" ");


        String  soyadinIlkHarfi = isim.split(" ")[1].substring(0,1);



        Boolean adinIlkHarfiBuyukMu = (adinIlkHarfi.charAt(0)>='A' && adinIlkHarfi.charAt(0)<='Z');
        Boolean soyadinIlkHarfiBuyukMu = (soyadinIlkHarfi.charAt(0)>='A' && soyadinIlkHarfi.charAt(0)<='Z');
        if(boslukIndex ==-1){
            System.out.println("Ad veya soyadi eksik ");
        }
        if(!adinIlkHarfiBuyukMu || !soyadinIlkHarfiBuyukMu){
            System.out.println("Bas harflerinde hata");
        }
        if(isim.equals(isim.toUpperCase())) {
            System.out.println("Format hatasi");
        }
        if(isim.replaceAll("\\s","").length()==0){
            System.out.println("Isim girilmedi ");
        }
        if(isim.replaceAll("\\s","").replaceAll("[A-Za-z]","").length()>0){
            System.out.println("Gecersiz Isim");
        }

 */
       //Password un ilk harfi buyuk harf ise
        //            'A' olursa gecerli password aksi halde gecersiz password tur.
        //
        //         Password un ilk harfi kucuk harf ise
        //            'z' olursa gecerli password aksi halde gecersiz password tur.
























    }
}
