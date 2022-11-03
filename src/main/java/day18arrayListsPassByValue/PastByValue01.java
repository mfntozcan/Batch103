package day18arrayListsPassByValue;

public class PastByValue01 {

    /*
    1;  Java variable lerin orjinal degerlerini korumak ister.
    2;  Variable method lar icinde kullanildiginda java methodun icine orjinal degeri koymaz, o degerin kopyasini uretir.
        ve methoda o kopyayi yollar.Method kopya uzerinde degisiklik yapar.
        Dolayisiyla variable nin orjinal degeri korunmus olur.
        Bu sisteme "Pass By Value" denir. Javanin methodlara her zaman kpya gondermesi ve orjinal degeri korumasidir.
        Pass by value ingilizce de degerini yolla anlamindadir.

        NOTE> Java Pass By Value kullanir. Bazi programlama dilleri orjinal degeri koruma altina almamistir.
        Bu isi developerlere birakmistir. Bu tarz diller "Pass By Referance " kullanir.
     */

    public static void main(String[] args) {

        int x =5;
        System.out.println(x);//

        //static method olan "main method" un icindeki hersey static olmalidir.
        //Asagida gorundugu gibi change methodu italik yazildi..

        change(x);//
        System.out.println(x);


        int ucret =100;

        int kopya = indirim(ucret);
        System.out.println(kopya);

        System.out.println(ucret);


    }
    // Buraya method olusturalim.
    //void birsey uretmez, sadece aksiyon yapar. (ekrana birsey yazdirir.)

    public static void change (int a){
        System.out.println(a*3);


    }
    // voud disindaki "return" type larda method body si icinde "return" keyword kullanilmalidir.
    //return kullaniciya ver demektir.

    public static int indirim(int gomlekUcreti){
        return gomlekUcreti -10 ;
    }
}
