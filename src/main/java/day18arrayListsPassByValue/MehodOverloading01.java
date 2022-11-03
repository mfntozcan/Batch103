package day18arrayListsPassByValue;

public class MehodOverloading01 {

    /*
    **********MethodOverloding Nasil yapilir*************
    1- Mehtod isimleri ayni olmalidir.
    2- Method parametreleri farkli olmalidir. parametreleri nasil degistirebilirz;
        i) Parametre sayilarini degirstirebiliriz.
        ii) Parametrelerin data tiplerini degistirebilriz.
        iii) Parametrelerin yerlerini degistirebileriz. Ancak data tipleri farkli ise.
     3- Method ismi + parametreler = Method Signature
        Method Signature disinda ne degistirirseniz degistirin Java o methodlari farkli kabul etmez.
        Cunku imzaya bakar.
     */

    public static void main(String[] args) {

        add(3,5);

        add(3, 5.0);

        //add(3.0,4.0);// buna method overloding denir. Asiri yukleme anlamindadir.



    }

    public static void add (int a, int b){
        System.out.println();
    }

    public static void add (int a, int b, int c){
        System.out.println();
    }
    public static void add (int a, double b){
        System.out.println();
    }

    public static void add (double a, int b){
        System.out.println();
    }

}
