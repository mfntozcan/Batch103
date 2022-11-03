package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*
        Verilen yilin "Leap Year(Artik Yil)" olup olmadigini kontrol eden kodu yaziniz.
        i) yil 100 e bolunurse 400 e de bolunmelidir.==>1600+       ==>1800-
        ii) yil 100 e bolunmezse 4 bolunmelidir. ==>1996+           ==>2001-
        (Interwiew de sorulabilir)
         */

        int year = 2001;
        String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year degil") : (year%4==0 ? "Leap year" : "Leap year degil");
        System.out.println(leap);

        /*
        Asagidaki kurallara gore password un dogru olup olmadigini kontrol eden kodu yaziniz.
        Kural1) Sekiz karekterden fazla veya sekiz karekter varsa ilk harfi '1' olmalidir.
        Kuaral2) Sekiz karekterden az kareketer varsa ilk harfi 'K' olmalidir

         */
        //length() methodu ile cozulur. Length methodu bize kac karekter oldugunu verir.
        //1Yol:

        String pwd = "i2a3ed54";

        String gecerli = pwd.length()<8 ? (pwd.charAt(0)=='K' ? "Gecerli" : "Gecersiz") : (pwd.charAt(0)=='i' ? "Gecerli" : "Gecersiz");
        System.out.println(gecerli);

        //2nci yol?

        String pwd1 = "i2ad54";
        char ilkHarf = pwd.charAt(0);

        String gecerlii = pwd1.length()<8 ? (ilkHarf=='K' ? "Gecerli" : "Gecersiz") : (ilkHarf=='i' ? "Gecerli" : "Gecersiz");
        System.out.println(gecerlii);




    }
}
