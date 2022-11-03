package javaquestinonbankturkish;

public class TypeCasting {

    public static void main(String[] args) {


        // Question 1; Herhangi bir 3 ogenin fiyatlari icin double data tipinde degiskenler olusturunuz.
        // Fiyatlerin toplamini konsola yazdiriniz.

        double a = 12.99;
        double b = 34.99;
        double c = 48.99;
        double toplam = a + b + c;
        System.out.println("Uc degiskenin toplami: " + toplam);

        // Question 2; Hergangi bir 3 oge icin floatl, long, ve integer data tipinde degiskenler olusturunuz.
        // Bu degiskenlerin degerlerinin carpimini konsolda yazdiriniz.

        float x = 43.15F;
        long y = 23L;
        int z = 234;
        float carpim = x * y * z;

        System.out.println("Uc sayinin carpimi: " + carpim);

        // Question 3; Basit faizi bulmak icin bir kod yaziniz.
        // Basit faiz formulu; Ana para*faiz orani*zaman/100

        int anaPara = 10000, faizOrani = 5, zaman = 3;
        int faizTutari = anaPara * faizOrani * zaman / 100;
        System.out.println("Faiz tutari: " + faizTutari);

        // Question 4; Bir String ve iki long data tipinde degiskenler olusturunuz. Konsolda bu long degiskenlerinin toplamini ve carpimini String ile yazdiriniz.

        String s = "Sonuc";
        long l = 1245L;
        long l1 = 98568526L;
        System.out.println("Toplami; " + (s + (l + l1)));
        System.out.println("Carpimi: " + (s + (l * l1)));

        // Question 5;

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 + " " + b2);

        //// Question 6;

        //1/yol;
        long kitap = 152L;
        long defter = 250L;
        long bigisayar = 142525L;
        System.out.println("Toplam Fiyat; " + (2 * kitap + 4 * defter + 3 * bigisayar));

        //2.yol.
        long kitap1 = 152L, defter1 = 250L, bilgisayar1 = 142525L;
        long toplamfiyat = 2 * kitap1 + 4 * defter1 + 3 * bilgisayar1;
        System.out.println("Toplam Fiyat: " + toplamfiyat);

        //

        /*short population=12541;
        double newpopulation= population;
        System.out.println(newpopulation);


        float staad= 1253.45F;
        short newstaad= (short) staad;
        System.out.println(newstaad);

        int num=510;
        byte newnum=(byte)num;
        System.out.println(newnum);

         */

        //Question 7;

        /*

        Scanner scan=new Scanner(System.in);
        System.out.println("2 sayi giriniz.");

        double n1= scan.nextDouble();
        double n2= scan.nextDouble();
        System.out.println("Kullanicinin girdigi degerler; "+ n1 + " ve " + n2+"'dir");

        double temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("Degistirdikten sonra "+ n1+"-"+n2);

         */

        // Type Casting Question 1;

        short s1 = 252;
        int newS1 = s1;

        // Type Casting Question 2;

        long s2 = 8000556566L;
        int newS2 = (int) s2;
        System.out.println(newS2);

        // Type Casting Question 3;

        double s3 = 12.45;
        float newS3 = (float) s3;

        // Type Casting Question 4;

        double s4 = 45.52;
        short newS4 = (short) s4;
        System.out.println(newS4);

        // Type Casting Question 5;

        byte s5= 85;
        double newS5=s5;
        System.out.println(newS5);


    }//main


}//class
