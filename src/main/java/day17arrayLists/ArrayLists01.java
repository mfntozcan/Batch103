package day17arrayLists;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);//[Tom, Thomas, Tahsin, Trump, Taceddin]

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        names.removeAll(cities);//Isimlerden su sehirlerin hepsinin ismini sil demektir.
        //removeAll() kullandiginizda sadece ilk list degisir, paranteszin icindeki list degismez
        System.out.println(names);//[Thomas, Tahsin]
        System.out.println(cities);//[Trump, Tom, Taceddin]

        List<String> myNames = new ArrayList<>();

        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean sonuc1 = names.containsAll(myNames);//coklu kontrol yapmak istedigimizde bunu kullaniriz.
        //containsAll() methodu ile myNames listesindeki elemanlarin olup olmadigini kontrol eder.
        //Bir listin icinde coklu elemanlarin var olup olmadigini kontrol eder.
        //hepsi varsa true, en az biri varsa false verir.
        System.out.println(sonuc1);//true

        //**__________________________________________________________________________________________________________**\\

        //Example 1= "a" listinde Shoes elemaninin ilk gorunumunu siliniz.


        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        a.remove("Shoes");
        System.out.println(a);

        //**__________________________________________________________________________________________________________**\\


        //Example 2= "a" listinde Shoes elemaninin tum  gorunumlerini siliniz.

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println(a);//[TV, Radio, Laptop, Book] tum Shoes gorunumleri silindi.

        //**__________________________________________________________________________________________________________**\\


        //Example 3= Bir tane salary Listi olusturun, eger salary  10000 den az ise %20, 10000 ve 10000 den coksa %10 zam yapaniz.

        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);

        System.out.println(salary);//[12345.0, 8674.5, 15000.75, 9500.0, 20500.0]

        for (Double w : salary) {
            if (w < 10000) {

                salary.set(salary.indexOf(w), w * 1.2);
            } else {

                salary.set(salary.indexOf(w), w * 1.1);
            }
        }
        System.out.println(salary);//[13579.500000000002, 10409.4, 16500.825, 11400.0, 22550.000000000004]

        //**__________________________________________________________________________________________________________**\\

        //Example 4=Iki ArrayList in esit olup omadigini kontrol eden kodu yaziniz.
        //note ; Iki ArrayList in esit olabilmesi icin, elemanlar esit olamli ve ayni elemanlar ayni index te olmali.

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        //m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1nci yol;

        int counter = 0;//Flag

        for(int i=0; i<m.size(); i++){
            if(m.size()!=n.size()){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }else if(m.get(i) != n.get(i)){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
        }
        if(counter==0){
            System.out.println("Listler esittir");
       }

        //2nci yol;

       /*boolean esitMi= m.equals(n);
        if (esitMi);{
            System.out.println("Listler esittir...");
        }else{
            System.out.println("Listler esit degildir...");
        }

        */


        //2.Yol:
        boolean esitmi = m.equals(n);

        if (esitmi){
            System.out.println("Listler esittir");
        }else{
            System.out.println("Listler esit degildir");
        }







    }
}
